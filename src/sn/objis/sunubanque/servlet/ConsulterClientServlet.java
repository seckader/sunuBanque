package sn.objis.sunubanque.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sn.objis.sunubanque.domaine.Client;
import sn.objis.sunubanque.domaine.CompteBancaire;
import sn.objis.sunubanque.service.ServiceClient;
import sn.objis.sunubanque.service.ServiceCompteBancaire;

/**
 * Servlet implementation class ConsulterClientServlet
 */
@WebServlet("/consulterClient")
public class ConsulterClientServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ConsulterClientServlet() {
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
		
		Long codeClient = Long.parseLong(request.getParameter("codeClient"));
		
		ServiceClient serviceClient = new ServiceClient();
		ServiceCompteBancaire serviceCompteBancaire = new ServiceCompteBancaire();
		
		Client client = serviceClient.findById(codeClient);
		List<CompteBancaire> listeCompteBancaires = serviceCompteBancaire.findCompteByClient(client);
		
		request.setAttribute("client", client);
		request.setAttribute("listeComptes", listeCompteBancaires);

		RequestDispatcher requestDispatcher = request.getRequestDispatcher("jsp/client.jsp");
		requestDispatcher.forward(request, response);
	}

}
