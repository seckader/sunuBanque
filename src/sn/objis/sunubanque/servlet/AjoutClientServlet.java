package sn.objis.sunubanque.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import sn.objis.sunubanque.service.ServiceEmploye;

/**
 * Servlet implementation class AjoutClientServlet
 */
@WebServlet("/ajoutClient")
public class AjoutClientServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AjoutClientServlet() {
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

		if (session.getAttribute("listeEmployes") == null) {
			session.setAttribute("listeEmployes", serviceEmploye.findAll());
		}

		RequestDispatcher requestDispatcher = request.getRequestDispatcher("jsp/ajouterClient.jsp");
		requestDispatcher.forward(request, response);
	}

}
