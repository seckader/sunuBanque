package sn.objis.sunubanque.dao;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

/**
 * Cette classe propose une impl�mentation pour toutes les m�thodes du CRUD.
 * 
 * @author Kader
 *
 * @param <E>:
 *            Repr�sente les entit�s mapp�es en relationnel.
 * @param <P>:
 *            Repr�sente les cl�s primaires des entit�s.
 */
public class AbstractIDaoGenericImpl<E, P extends Serializable> implements IDaoGeneric<E, P> {

	private EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("sunuBanque");

	protected EntityManager entityManager = entityManagerFactory.createEntityManager();

	private Class<E> entity;

	public AbstractIDaoGenericImpl(Class<E> entity) {
		super();
		this.entity = entity;
	}

	@Override
	public void create(E element) {
		entityManager.persist(element);
	}

	@Override
	public E findById(P id) {
		
		E elementTrouve = null;
		
		elementTrouve = entityManager.find(entity, id);
		
		return elementTrouve;
	}

	@Override
	public void update(E element) {
		entityManager.merge(element);
	}

	@Override
	public void delete(E element) {
		
		if(entityManager.contains(element)) {
			entityManager.remove(element);
		}else {
			entityManager.remove(entityManager.merge(element));
		}
		
	}

	@Override
	public List<E> findAll() {
		
		List<E> listeElements;
		
		String requeteJPQL = "SELECT e FROM E e";
		TypedQuery<E> typedQuery = entityManager.createQuery(requeteJPQL, entity);
		listeElements = typedQuery.getResultList();
		
		return listeElements;
	}

}
