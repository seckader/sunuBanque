package sn.objis.sunubanque.domaine;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

/**
 * Cette classe représente un groupe d'employés de la banque.
 *
 */
@Entity
@NamedQueries({
	@NamedQuery(name = Groupe.FIND_ALL_GROUPE, query = "SELECT g FROM Groupe g")
})
public class Groupe implements Serializable {

	private static final long serialVersionUID = 1L;

	public static final String FIND_ALL_GROUPE = "listerGroupes";

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long numeroGroupe;

	private String nomGroupe;

	/**
	 * Un groupe peut contenir plusieurs employés. (Mapping Many-to-Many
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
