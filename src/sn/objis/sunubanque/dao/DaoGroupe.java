package sn.objis.sunubanque.dao;

import java.util.List;

import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Join;
import javax.persistence.criteria.ParameterExpression;
import javax.persistence.criteria.Root;

import sn.objis.sunubanque.domaine.Employe;
import sn.objis.sunubanque.domaine.Groupe;

/**
 * Cette classe propose une impl�mentation pour les m�thodes d'interaction avec
 * la base de donn�es sp�cifiques � l'entit� Groupe.
 * 
 * @author Kader
 *
 */
public class DaoGroupe extends AbstractIDaoGenericImpl<Groupe, Long> implements IDaoGroupe {

	public DaoGroupe() {
		super(Groupe.class);
	}

	@Override
	public List<Groupe> findGroupsOfEmploye(Employe employe) {

		List<Groupe> listeGroupes;

		entityTransaction.begin();

		CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
		CriteriaQuery<Groupe> criteriaQuery = criteriaBuilder.createQuery(Groupe.class);

		// SELECT g FROM Groupe g JOIN g.listeEmployes e WHERE e=:employe
		Root<Groupe> root = criteriaQuery.from(Groupe.class);
		Join<Groupe, Employe> join = root.join("listeEmployes");

		ParameterExpression<Employe> parameterExpression = criteriaBuilder.parameter(Employe.class);

		criteriaQuery.select(root);
		criteriaQuery.where(criteriaBuilder.equal(parameterExpression, join));

		TypedQuery<Groupe> typedQuery = entityManager.createQuery(criteriaQuery);
		typedQuery.setParameter(parameterExpression, employe);
		listeGroupes = typedQuery.getResultList();

		entityTransaction.commit();

		return listeGroupes;
	}

	@Override
	public Groupe findByName(String name) {

		Groupe groupe = null;

		entityTransaction.begin();

		String requeteJPQL = "SELECT g FROM Groupe g WHERE g.nomGroupe = :nomGroupe";
		TypedQuery<Groupe> typedQuery = entityManager.createQuery(requeteJPQL, Groupe.class);
		typedQuery.setParameter("nomGroupe", name);
		groupe = typedQuery.getSingleResult();

		entityTransaction.commit();

		return groupe;
	}

	@Override
	public List<Groupe> findAll() {
		List<Groupe> listeGroupes;

		entityTransaction.begin();

		TypedQuery<Groupe> typedQuery = entityManager.createNamedQuery(Groupe.FIND_ALL_GROUPE, Groupe.class);
		listeGroupes = typedQuery.getResultList();

		entityTransaction.commit();

		return listeGroupes;
	}

}
