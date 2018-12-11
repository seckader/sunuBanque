package sn.objis.sunubanque.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sn.objis.sunubanque.domaine.CompteBancaire;
import sn.objis.sunubanque.domaine.Employe;
import sn.objis.sunubanque.service.ServiceCompteBancaire;
import sn.objis.sunubanque.service.ServiceEmploye;

/**
 * Servlet implementation class ConsulterEmployeServlet
 */
@WebServlet("/consulterEmploye")
public class ConsulterEmployeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ConsulterEmployeServlet() {
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
		Long codeEmploye = Long.parseLong(request.getParameter("codeEmploye"));
		
		ServiceEmploye serviceEmploye = new ServiceEmploye();
		ServiceCompteBancaire serviceCompteBancaire = new ServiceCompteBancaire();
		
		Employe employe = serviceEmploye.findById(codeEmploye);
		List<CompteBancaire> comptesCrees = serviceCompteBancaire.findCompteByEmploye(employe);
		
		request.setAttribute("employe", employe);
		request.setAttribute("listeComptesCrees", comptesCrees);
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("jsp/employe.jsp");
		requestDispatcher.forward(request, response);
		
	}

}
