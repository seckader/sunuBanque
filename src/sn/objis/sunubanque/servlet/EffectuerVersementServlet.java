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

import sn.objis.sunubanque.domaine.CompteBancaire;
import sn.objis.sunubanque.domaine.Employe;
import sn.objis.sunubanque.domaine.Operation;
import sn.objis.sunubanque.domaine.Versement;
import sn.objis.sunubanque.service.ServiceCompteBancaire;
import sn.objis.sunubanque.service.ServiceOperation;

/**
 * Servlet implementation class EffectuerVersementServlet
 */
@WebServlet("/effectuerVersement")
public class EffectuerVersementServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public EffectuerVersementServlet() {
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
		traitement(request, response);
	}

	protected void traitement(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession();

		ServiceCompteBancaire serviceCompteBancaire = new ServiceCompteBancaire();
		ServiceOperation serviceOperation = new ServiceOperation();
		
		String numeroCompte = request.getParameter("numeroCompte");
		double montant = Double.parseDouble(request.getParameter("montant"));
		Date today = new Date(new Timestamp(System.currentTimeMillis()).getTime());

		CompteBancaire compteBancaire = serviceCompteBancaire.findByNumeroCompte(numeroCompte);
		
		if (serviceCompteBancaire.versement(compteBancaire, montant)) {
			Employe employe = (Employe) session.getAttribute("employeConnecte");
			
			Operation operation = new Versement();
			operation.setDateOperation(today);
			operation.setMontant(montant);
			operation.setEmploye(employe);

			compteBancaire.getListeOperations().add(operation);

			try {
				serviceOperation.create(operation);
				serviceCompteBancaire.update(compteBancaire);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
