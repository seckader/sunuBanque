package sn.objis.sunubanque.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.util.List;
import java.util.ArrayList;

import sn.objis.sunubanque.domaine.Employe;
import sn.objis.sunubanque.domaine.Utilisateur;
import sn.objis.sunubanque.domaine.Role;
import sn.objis.sunubanque.domaine.Groupe;
import sn.objis.sunubanque.service.ServiceEmploye;
import sn.objis.sunubanque.service.ServiceRole;
import sn.objis.sunubanque.service.ServiceGroupe;

/**
 * Servlet implementation class AjouterEmployeServlet
 */
@WebServlet("/ajouterEmploye")
public class AjouterEmployeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AjouterEmployeServlet() {
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
		ServiceRole serviceRole = new ServiceRole();
		ServiceGroupe serviceGroupe = new ServiceGroupe();

		String nom = request.getParameter("nomEmploye");
		String prenom = request.getParameter("prenomEmploye");

		Employe employe = new Employe();
		employe.setNomEmploye(nom);
		employe.setPrenomEmploye(prenom);

		String login = request.getParameter("login");
		String password = request.getParameter("password");

		Utilisateur utilisateur = new Utilisateur();
		utilisateur.setLogin(login);
		utilisateur.setPassword(password);

		Long codeSuperieur = Long.parseLong(request.getParameter("superieur"));
		if (codeSuperieur != 0) {
			Employe superieurHierarchique = serviceEmploye.findById(codeSuperieur);
			employe.setSuperieurHierarchique(superieurHierarchique);
		}

		List<Role> listeRoles;
		if (session.getAttribute("listeRoles") == null) {
			session.setAttribute("listeRoles", serviceRole.findAll());
		}
		listeRoles = (List<Role>) session.getAttribute("listeRoles");
		Role roleChoisi;
		List<Role> listeRolesChoisis = new ArrayList<>();
		for (Role role : listeRoles) {
			String nomRole = request.getParameter(role.getNom());

			if (nomRole != null) {
				roleChoisi = serviceRole.findByName(nomRole);
				listeRolesChoisis.add(roleChoisi);
			}

		}
		utilisateur.setListeRoles(listeRolesChoisis);
		employe.setUtilisateur(utilisateur);

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

		try {
			serviceEmploye.create(employe);
		} catch (Exception e) {
			e.printStackTrace();
		}

		if (session.getAttribute("listeEmployes") == null) {
			session.setAttribute("listeEmployes", serviceEmploye.findAll());
		} else {
			List<Employe> listeEmployes = (List<Employe>) session.getAttribute("listeEmployes");
			listeEmployes.add(employe);
			session.setAttribute("listeEmployes", listeEmployes);
		}

		RequestDispatcher requestDispatcher = request.getRequestDispatcher("jsp/listeEmployes.jsp");
		requestDispatcher.forward(request, response);

	}

}
