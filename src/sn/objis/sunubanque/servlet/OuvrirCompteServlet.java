package sn.objis.sunubanque.servlet;

import java.io.IOException;
import java.sql.Date;
import java.sql.Timestamp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import sn.objis.sunubanque.domaine.Client;
import sn.objis.sunubanque.domaine.CompteBancaire;
import sn.objis.sunubanque.domaine.CompteCourant;
import sn.objis.sunubanque.domaine.CompteEpargne;
import sn.objis.sunubanque.domaine.Employe;
import sn.objis.sunubanque.service.ServiceClient;
import sn.objis.sunubanque.service.ServiceCompteBancaire;

/**
 * Servlet implementation class OuvrirCompteServlet
 */
@WebServlet("/ouvrirCompte")
public class OuvrirCompteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OuvrirCompteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		traitement(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		traitement(request, response);
	}
	
	protected void traitement(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		
		ServiceClient serviceClient = new ServiceClient();
		ServiceCompteBancaire serviceCompte = new ServiceCompteBancaire();
		
		String action = request.getParameter("action");
		Long codeClient = Long.parseLong(request.getParameter("codeClient"));
		String numeroCompte = request.getParameter("numeroCompte");
		Double solde = Double.parseDouble(request.getParameter("solde"));
		
		CompteBancaire compteBancaire = null;
		if (action.equals("Epargne")) {
			double taux = Double.parseDouble(request.getParameter("taux"));
			compteBancaire = new CompteEpargne(taux);
		} else if (action.equals("Courant")) {	
			double decouvert = Double.parseDouble(request.getParameter("decouvert"));
			compteBancaire = new CompteCourant(decouvert);
		}
		compteBancaire.setNumeroCompte(numeroCompte);

		Date today = new Date(new Timestamp(System.currentTimeMillis()).getTime());
		compteBancaire.setDateCreation(today);

		compteBancaire.setSolde(solde);
		compteBancaire.setTypeCompte(action);
		
		Employe employe = (Employe) session.getAttribute("employeConnecte");
		compteBancaire.setEmploye(employe);
		
		Client client = serviceClient.findById(codeClient);
		compteBancaire.setClient(client);

		try {
			serviceCompte.create(compteBancaire);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
