package sn.objis.sunubanque.domaine;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

/**
 * Classe représentant un utilisateur avec son login et son mot de passe.
 *
 */
@Entity

public class Utilisateur implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idUtilisateur;

	@Column(unique = true, nullable = false)
	private String login;

	private String password;

	/**
	 * Chaque utilisateur peut avoir plusieurs rôles (Mapping Many-to-Many
	 * unidirectionnel)
	 */
	@ManyToMany
	@JoinTable(joinColumns = @JoinColumn(name = "idUtilisateur"), inverseJoinColumns = @JoinColumn(name = "idRole"))
	private List<Role> listeRoles;

	public Utilisateur() {
		super();
	}

	public long getIdUtilisateur() {
		return this.idUtilisateur;
	}

	public void setIdUtilisateur(long idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}

	public String getLogin() {
		return this.login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Role> getListeRoles() {
		return listeRoles;
	}

	public void setListeRoles(List<Role> listeRoles) {
		this.listeRoles = listeRoles;
	}

}
