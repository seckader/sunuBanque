package sn.objis.sunubanque.domaine;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Cette classe permet d'associer des rôles 
 * à chaque utilisateurs
 *
 */
@Entity

public class Role implements Serializable {

	private static final long serialVersionUID = 1L;
	
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
   
}
