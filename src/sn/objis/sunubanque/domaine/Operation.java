package sn.objis.sunubanque.domaine;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 * Cette classe représente les opérations pouvant être réalisé sur un compte
 * bancaire.
 *
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "typeOperation", discriminatorType = DiscriminatorType.STRING)
@NamedQueries({
	@NamedQuery(name = Operation.FIND_ALL_OPERATION, query = "SELECT o FROM Operation o")
})
public abstract class Operation implements Serializable {

	private static final long serialVersionUID = 1L;
	
	public static final String FIND_ALL_OPERATION = "listerOperations";

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long numeroOperation;

	@Column(nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateOperation;

	private double montant;

	/**
	 * Une opération est effectuée par un employé (Mapping Many-to-One
	 * unidirectionnel).
	 */
	@ManyToOne
	private Employe employe;

	public Operation() {
		super();
	}

	public long getNumeroOperation() {
		return this.numeroOperation;
	}

	public void setNumeroOperation(long numeroOperation) {
		this.numeroOperation = numeroOperation;
	}

	public Date getDateOperation() {
		return this.dateOperation;
	}

	public void setDateOperation(Date dateOperation) {
		this.dateOperation = dateOperation;
	}

	public double getMontant() {
		return this.montant;
	}

	public void setMontant(double montant) {
		this.montant = montant;
	}

	public Employe getEmploye() {
		return employe;
	}

	public void setEmploye(Employe employe) {
		this.employe = employe;
	}

}
