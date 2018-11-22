package sn.objis.sunuBanque.domaine;

import java.io.Serializable;
import javax.persistence.*;
import sn.objis.sunuBanque.domaine.Operation;

/**
 * Cette classe représente une opération de versement pouvant être réalisée sur
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
