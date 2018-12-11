package sn.objis.sunubanque.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import sn.objis.sunubanque.domaine.Employe;
import sn.objis.sunubanque.domaine.Utilisateur;
import sn.objis.sunubanque.service.ServiceEmploye;
import sn.objis.sunubanque.service.ServiceUtilisateur;

/**
 * Servlet implementation class RedirectServlet
 */
@WebServlet("/redirect")
public class RedirectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RedirectServlet() {
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
		traitement(request, response);
	}
	
	protected void traitement(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		
		String login = request.getUserPrincipal().getName();
		
		System.out.println(login);
		
		ServiceUtilisateur serviceUtilisateur = new ServiceUtilisateur();
		ServiceEmploye serviceEmploye = new ServiceEmploye();
		
		Utilisateur utilisateur = serviceUtilisateur.findByLogin(login);
		
		Employe employe = serviceEmploye.findByUtilisateur(utilisateur);
		
		session.setAttribute("employeConnecte", employe);
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("index.jsp");
		requestDispatcher.forward(request, response);
	}

}
