package sn.objis.sunubanque.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import sn.objis.sunubanque.service.ServiceGroupe;
import sn.objis.sunubanque.service.ServiceEmploye;
import sn.objis.sunubanque.service.ServiceRole;

/**
 * Servlet implementation class AjoutEmployeServlet
 */
@WebServlet("/ajoutEmploye")
public class AjoutEmployeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AjoutEmployeServlet() {
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
		
		ServiceEmploye serviceEmploye = new ServiceEmploye();
		ServiceGroupe serviceGroupe = new ServiceGroupe();
		ServiceRole serviceRole = new ServiceRole();

		if (session.getAttribute("listeEmployes") == null) {
			session.setAttribute("listeEmployes", serviceEmploye.findAll());
		}

		if (session.getAttribute("listeGroupes") == null) {
			session.setAttribute("listeGroupes", serviceGroupe.findAll());
		}

		if (session.getAttribute("listeRoles") == null) {
			session.setAttribute("listeRoles", serviceRole.findAll());
		}

		RequestDispatcher requestDispatcher = request.getRequestDispatcher("jsp/superieur/ajouterEmploye.jsp");
		requestDispatcher.forward(request, response);
	}

}
