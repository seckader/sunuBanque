package sn.objis.sunubanque.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sn.objis.sunubanque.dao.DaoGroupe;
import sn.objis.sunubanque.domaine.Groupe;

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
		String nomGroupe = request.getParameter("nomGroupe");
		
		Groupe groupe = new Groupe();
		groupe.setNomGroupe(nomGroupe);
		
		DaoGroupe dao = new DaoGroupe();
		
		try {
			dao.create(groupe);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
