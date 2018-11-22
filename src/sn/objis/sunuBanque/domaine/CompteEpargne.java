package sn.objis.sunuBanque.domaine;

import java.io.Serializable;
import javax.persistence.*;
import sn.objis.sunuBanque.domaine.CompteBancaire;

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
	public double getTaux() {
		return this.taux;
	}

	public void setTaux(double taux) {
		this.taux = taux;
	}
   
}
