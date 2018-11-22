package sn.objis.sunuBanque.domaine;

import java.io.Serializable;
import javax.persistence.*;
import sn.objis.sunuBanque.domaine.CompteBancaire;

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
