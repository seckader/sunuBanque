package sn.objis.sunubanque.dao;

import sn.objis.sunubanque.domaine.Operation;

/**
 * Cette classe propose une implémentation pour les méthodes d'interaction avec
 * la base de données spécifiques à l'entité Operation.
 * 
 * @author Kader
 *
 */
public class DaoOperation extends AbstractIDaoGenericImpl<Operation, Long> implements IDaoOperation {

	public DaoOperation() {
		super(Operation.class);
	}

}
