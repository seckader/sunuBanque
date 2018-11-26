package sn.objis.sunubanque.domaine;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Cette classe représente un compte bancaire d'un client.
 *
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "typeCompte", discriminatorType = DiscriminatorType.STRING)
@NamedQueries({
		/*
		 * Requête permettant de lister les comptes bancaires d'un client.
		 */
		@NamedQuery(name = CompteBancaire.FIND_ALL_COMPTE_BY_CLIENT, query = "SELECT b FROM CompteBancaire b JOIN b.client c WHERE c=:client"),
		
		/*
		 * Requête permettant de lister les comptes bancaires créées par un employe.
		 */
		@NamedQuery(name = CompteBancaire.FIND_ALL_COMPTE_BY_EMPLOYE, query = "SELECT c FROM CompteBancaire c JOIN c.employe e WHERE e=:employe")
})
public abstract class CompteBancaire implements Serializable {

	private static final long serialVersionUID = 1L;

	public static final String FIND_ALL_COMPTE_BY_CLIENT = "listerParClient";
	public static final String FIND_ALL_COMPTE_BY_EMPLOYE = "listerParEmploye";

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idCompteBancaire;

	@Column(unique = true, nullable = false)
	private String numeroCompte;

	@Column(nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateCreation;

	private double solde;

	/**
	 * Un compte bancaire est créé par un employé (Mapping Many-to-One
	 * Unidirectionnel)
	 */
	@ManyToOne
	private Employe employe;

	/**
	 * Un compte bancaire est possédé par un et un seul client.
	 */
	@ManyToOne
	private Client client;

	/**
	 * Un compte peut subir plusieurs opérations (Mapping One-to-Many
	 * unidirectionnel).
	 */
	@OneToMany
	private List<Operation> listeOperations;

	public CompteBancaire() {
		super();
	}

	public long getIdCompteBancaire() {
		return this.idCompteBancaire;
	}

	public void setIdCompteBancaire(long idCompteBancaire) {
		this.idCompteBancaire = idCompteBancaire;
	}

	public String getNumeroCompte() {
		return this.numeroCompte;
	}

	public void setNumeroCompte(String numeroCompte) {
		this.numeroCompte = numeroCompte;
	}

	public Date getDateCreation() {
		return this.dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	public double getSolde() {
		return this.solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	public Employe getEmploye() {
		return employe;
	}

	public void setEmploye(Employe employe) {
		this.employe = employe;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

}
