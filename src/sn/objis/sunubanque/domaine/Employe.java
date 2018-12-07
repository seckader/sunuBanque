package sn.objis.sunubanque.domaine;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

/**
 * Cette classe repr�sente un employ� de la banque.
 *
 */
@Entity

public class Employe implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long codeEmploye;

	private String nomEmploye;
	private String prenomEmploye;

	/**
	 * Chaque employ� correspond � un utilisateur (Mapping One-to-One
	 * unidirectionnel)
	 */
	@OneToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(referencedColumnName = "idUtilisateur")
	private Utilisateur utilisateur;

	/**
	 * Un employ� peut avoir 0 ou 1 sup�rieur hierarchique.
	 */
	@JoinColumn(name="superieur")
	@ManyToOne(targetEntity = Employe.class)
	private Employe superieurHierarchique;

	/**
	 * Un employe peut appartenir � plusieurs groupes (Mapping Many-to-Many
	 * bidirectionnel)
	 */
	@ManyToMany
	@JoinTable(joinColumns=@JoinColumn(name="idEtudiant"), inverseJoinColumns=@JoinColumn(name="numeroGroupe"))
	private List<Groupe> listeGroupes;

	public Employe() {
		super();
	}

	public long getCodeEmploye() {
		return this.codeEmploye;
	}

	public void setCodeEmploye(long codeEmploye) {
		this.codeEmploye = codeEmploye;
	}

	public String getNomEmploye() {
		return this.nomEmploye;
	}

	public void setNomEmploye(String nomEmploye) {
		this.nomEmploye = nomEmploye;
	}

	public String getPrenomEmploye() {
		return this.prenomEmploye;
	}

	public void setPrenomEmploye(String prenomEmploye) {
		this.prenomEmploye = prenomEmploye;
	}

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	public Employe getSuperieurHierarchique() {
		return superieurHierarchique;
	}

	public void setSuperieurHierarchique(Employe superieurHierarchique) {
		this.superieurHierarchique = superieurHierarchique;
	}

	public List<Groupe> getListeGroupes() {
		return listeGroupes;
	}

	public void setListeGroupes(List<Groupe> listeGroupes) {
		this.listeGroupes = listeGroupes;
	}

}
