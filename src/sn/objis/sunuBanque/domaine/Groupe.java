package sn.objis.sunuBanque.domaine;

import java.io.Serializable;
import java.lang.String;
import java.util.List;

import javax.persistence.*;

/**
 * Cette classe repr�sente un groupe d'employ�s de la banque.
 *
 */
@Entity

public class Groupe implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long numeroGroupe;

	private String nomGroupe;

	/**
	 * Un groupe peut contenir plusieurs employ�s. (Mapping Many-to-Many
	 * bidirectionnel)
	 */
	@ManyToMany(mappedBy="listeGroupes")
	private List<Employe> listeEmployes;

	public Groupe() {
		super();
	}

	public long getNumeroGroupe() {
		return this.numeroGroupe;
	}

	public void setNumeroGroupe(long numeroGroupe) {
		this.numeroGroupe = numeroGroupe;
	}

	public String getNomGroupe() {
		return this.nomGroupe;
	}

	public void setNomGroupe(String nomGroupe) {
		this.nomGroupe = nomGroupe;
	}

	public List<Employe> getListeEmployes() {
		return listeEmployes;
	}

	public void setListeEmployes(List<Employe> listeEmployes) {
		this.listeEmployes = listeEmployes;
	}

}
