package sn.objis.sunubanque.dao;

import java.util.List;

import javax.persistence.TypedQuery;

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

	@Override
	public List<Operation> findAll() {
		List<Operation> listeOperations;

		entityTransaction.begin();

		TypedQuery<Operation> typedQuery = entityManager.createNamedQuery(Operation.FIND_ALL_OPERATION, Operation.class);
		listeOperations = typedQuery.getResultList();

		entityTransaction.commit();

		return listeOperations;
	}

}
