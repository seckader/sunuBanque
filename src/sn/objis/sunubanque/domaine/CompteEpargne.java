package sn.objis.sunubanque.domaine;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * Cette classe représente un CompteEpargne.
 *
 */
@Entity
@DiscriminatorValue("Epargne")
public class CompteEpargne extends CompteBancaire implements Serializable {

	private static final long serialVersionUID = 1L;

	private double taux;

	public CompteEpargne() {
		super();
	}

	public CompteEpargne(double taux) {
		super();
		this.taux = taux;
	}

	public double getTaux() {
		return this.taux;
	}

	public void setTaux(double taux) {
		this.taux = taux;
	}

}
