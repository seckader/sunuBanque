package sn.objis.sunubanque.dao;

import sn.objis.sunubanque.domaine.Operation;

/**
 * Cette classe propose une impl�mentation pour les m�thodes d'interaction avec
 * la base de donn�es sp�cifiques � l'entit� Operation.
 * 
 * @author Kader
 *
 */
public class DaoOperation extends AbstractIDaoGenericImpl<Operation, Long> implements IDaoOperation {

	public DaoOperation() {
		super(Operation.class);
	}

}
