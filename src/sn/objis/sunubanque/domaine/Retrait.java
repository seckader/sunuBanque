package sn.objis.sunubanque.domaine;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

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
