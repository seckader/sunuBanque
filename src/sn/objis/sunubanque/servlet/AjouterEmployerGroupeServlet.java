package sn.objis.sunubanque.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import sn.objis.sunubanque.domaine.Employe;
import sn.objis.sunubanque.domaine.Groupe;
import sn.objis.sunubanque.service.ServiceEmploye;
import sn.objis.sunubanque.service.ServiceGroupe;

/**
 * Servlet implementation class AjouterEmployerGroupeServlet
 */
@WebServlet("/ajouterEmployerGroupe")
public class AjouterEmployerGroupeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AjouterEmployerGroupeServlet() {
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

		ServiceEmploye serviceEmploye = new ServiceEmploye();
		ServiceGroupe serviceGroupe = new ServiceGroupe();

		Long codeEmploye = Long.parseLong(request.getParameter("codeEmploye"));

		Employe employe = serviceEmploye.findById(codeEmploye);

		List<Groupe> listeGroupes;
		if (session.getAttribute("listeGroupes") == null) {
			session.setAttribute("listeGroupes", serviceGroupe.findAll());
		}
		listeGroupes = (List<Groupe>) session.getAttribute("listeGroupes");
		Groupe groupeChoisi;
		List<Groupe> listeGroupesChoisis = new ArrayList<>();
		for (Groupe groupe : listeGroupes) {
			String nomGroupe = request.getParameter(groupe.getNomGroupe());

			if (nomGroupe != null) {
				groupeChoisi = serviceGroupe.findByName(nomGroupe);
				listeGroupesChoisis.add(groupeChoisi);
			}
		}

		employe.setListeGroupes(listeGroupesChoisis);

		serviceEmploye.update(employe);

		RequestDispatcher requestDispatcher = request
				.getRequestDispatcher("consulterEmploye?codeEmploye=" + employe.getCodeEmploye());
		requestDispatcher.forward(request, response);
	}

}
