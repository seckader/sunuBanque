package sn.objis.sunubanque.domaine;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * Cette classe repréente un CompteCourant.
 *
 */
@Entity
@DiscriminatorValue("Courant")
public class CompteCourant extends CompteBancaire implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private double decouvert;

	public CompteCourant() {
		super();
	}   
	public double getDecouvert() {
		return this.decouvert;
	}

	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	}
   
}
