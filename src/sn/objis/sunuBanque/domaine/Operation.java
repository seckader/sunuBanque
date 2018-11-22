package sn.objis.sunuBanque.domaine;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 * Cette classe repr�sente les op�rations pouvant �tre r�alis� sur un compte
 * bancaire.
 *
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "typeOperation", discriminatorType = DiscriminatorType.STRING)
public abstract class Operation implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long numeroOperation;

	@Column(nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateOperation;

	private double montant;

	/**
	 * Une op�ration est effectu�e par un employ� (Mapping Many-to-One
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

}
