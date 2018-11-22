package sn.objis.sunuBanque.domaine;

import java.io.Serializable;
import javax.persistence.*;
import sn.objis.sunuBanque.domaine.Operation;

/**
 * Cette classe représente une opération de retrait pouvant être réalisée sur un
 * compte.
 *
 */
@Entity
@DiscriminatorValue("Retrait")
public class Retrait extends Operation implements Serializable {

	private static final long serialVersionUID = 1L;

	public Retrait() {
		super();
	}

}
