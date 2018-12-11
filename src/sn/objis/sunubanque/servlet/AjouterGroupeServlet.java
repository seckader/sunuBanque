package sn.objis.sunubanque.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import sn.objis.sunubanque.domaine.Groupe;
import sn.objis.sunubanque.service.ServiceGroupe;;

/**
 * Servlet implementation class AjouterGroupeServlet
 */
@WebServlet("/ajouterGroupe")
public class AjouterGroupeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AjouterGroupeServlet() {
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
		
		String nomGroupe = request.getParameter("nomGroupe");

		Groupe groupe = new Groupe();
		groupe.setNomGroupe(nomGroupe);

		ServiceGroupe service = new ServiceGroupe();
		
		try {
			service.create(groupe);
		} catch (Exception e) {
			e.printStackTrace();
		}

		if (session.getAttribute("listeGroupes") == null) {
			session.setAttribute("listeGroupes", service.findAll());
		} else {
			List<Groupe> listeGroupes = (List<Groupe>) session.getAttribute("listeGroupes");
			listeGroupes.add(groupe);
			session.setAttribute("listeGroupes", listeGroupes);
		}

		RequestDispatcher requestDispatcher = request.getRequestDispatcher("jsp/listeGroupes.jsp");
		requestDispatcher.forward(request, response);
	}

}
