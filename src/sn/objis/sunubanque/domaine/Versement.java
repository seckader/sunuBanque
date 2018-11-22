package sn.objis.sunubanque.domaine;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * Cette classe repr�sente une op�ration de versement pouvant �tre r�alis�e sur
 * un compte bancaire.
 *
 */
@Entity
@DiscriminatorValue("Versement")
public class Versement extends Operation implements Serializable {

	private static final long serialVersionUID = 1L;

	public Versement() {
		super();
	}

}
