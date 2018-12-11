package sn.objis.sunubanque.domaine;

import java.io.Serializable;
import java.security.Principal;

import javax.persistence.*;

/**
 * Cette classe permet d'associer des rôles 
 * à chaque utilisateurs
 *
 */
@Entity
@NamedQueries({
	@NamedQuery(name = Role.FIND_ALL_ROLE, query = "SELECT r FROM Role r")
})
public class Role implements Serializable, Principal {

	private static final long serialVersionUID = 1L;
	
	public static final String FIND_ALL_ROLE = "listerRoles";
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long idRole;
	
	@Column(unique=true, nullable=false)
	private String nom;
	

	public Role() {
		super();
	}   
	public long getIdRole() {
		return this.idRole;
	}

	public void setIdRole(long idRole) {
		this.idRole = idRole;
	}   
	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	@Override
	public String getName() {
		return getNom();
	}
   
}
