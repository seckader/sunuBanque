package sn.objis.sunubanque.domaine;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

/**
 * Cette classe représente un client de la banque.
 *
 */
@Entity

public class Client implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long codeClient;
	private String nomClient;
	private String prenomClient;
	private String adresse;
	
	@Column(length=9)
	private long numeroTelephone;
	
	/**
	 * Un client possède plusieurs compte bancaires.
	 */
	@OneToMany(mappedBy="client")
	private List<CompteBancaire> listeComptesBancaires;

	public Client() {
		super();
	}   
	public long getCodeClient() {
		return this.codeClient;
	}

	public void setCodeClient(long codeClient) {
		this.codeClient = codeClient;
	}   
	public String getNomClient() {
		return this.nomClient;
	}

	public void setNomClient(String nomClient) {
		this.nomClient = nomClient;
	}   
	public String getPrenomClient() {
		return this.prenomClient;
	}

	public void setPrenomClient(String prenomClient) {
		this.prenomClient = prenomClient;
	}   
	public String getAdresse() {
		return this.adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}   
	public long getNumeroTelephone() {
		return this.numeroTelephone;
	}

	public void setNumeroTelephone(long numeroTelephone) {
		this.numeroTelephone = numeroTelephone;
	}
	public List<CompteBancaire> getListeComptesBancaires() {
		return listeComptesBancaires;
	}
	public void setListeComptesBancaires(List<CompteBancaire> listeComptesBancaires) {
		this.listeComptesBancaires = listeComptesBancaires;
	}
   
}
