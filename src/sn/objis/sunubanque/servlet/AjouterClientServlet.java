package sn.objis.sunubanque.servlet;

import java.io.IOException;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;

import javax.servlet.RequestDispatcher;
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
 * Servlet implementation class AjouterClientServlet
 */
@WebServlet("/ajouterClient")
public class AjouterClientServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AjouterClientServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		traitement(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		traitement(request, response);
	}

	protected void traitement(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession();
		
		ServiceClient serviceClient = new ServiceClient();
		ServiceCompteBancaire serviceCompte = new ServiceCompteBancaire();

		String nom = request.getParameter("nomClient");
		String prenom = request.getParameter("prenomClient");
		String adresse = request.getParameter("adresse");
		Long telephone = Long.parseLong(request.getParameter("telephone"));
		String numeroCompte = request.getParameter("numeroCompte");
		Double solde = Double.parseDouble(request.getParameter("solde"));

		String typeCompte = request.getParameter("typeCompte");

		Employe employe = (Employe) session.getAttribute("employeConnecte");

		Client client = new Client();
		client.setNomClient(nom);
		client.setPrenomClient(prenom);
		client.setAdresse(adresse);
		client.setNumeroTelephone(telephone);

		CompteBancaire compteBancaire = null;
		if (typeCompte.equals("Epargne")) {
			double taux = Double.parseDouble(request.getParameter("taux"));
			compteBancaire = new CompteEpargne(taux);
		} else if (typeCompte.equals("Courant")) {	
			double decouvert = Double.parseDouble(request.getParameter("decouvert"));
			compteBancaire = new CompteCourant(decouvert);
		}
		compteBancaire.setNumeroCompte(numeroCompte);

		Date today = new Date(new Timestamp(System.currentTimeMillis()).getTime());
		compteBancaire.setDateCreation(today);

		compteBancaire.setSolde(solde);
		compteBancaire.setEmploye(employe);
		compteBancaire.setTypeCompte(typeCompte);
		compteBancaire.setClient(client);

		try {
			serviceClient.create(client);
			serviceCompte.create(compteBancaire);
		} catch (Exception e) {
			e.printStackTrace();
		}

		if (session.getAttribute("listeClients") == null) {
			session.setAttribute("listeClients", serviceClient.findAll());
		} else {
			List<Client> listeClients = (List<Client>) session.getAttribute("listeClients");
			listeClients.add(client);
			session.setAttribute("listeClients", listeClients);
		}

		RequestDispatcher requestDispatcher = request.getRequestDispatcher("jsp/listeClients.jsp");
		requestDispatcher.forward(request, response);

	}

}
