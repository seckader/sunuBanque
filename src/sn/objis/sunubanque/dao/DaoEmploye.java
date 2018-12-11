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
import sn.objis.sunubanque.domaine.Utilisateur;

/**
 * Cette classe propose une implémentation pour les méthodes d'interaction avec
 * la base de données spécifiques à l'entité Employe.
 * 
 * @author Kader
 *
 */
public class DaoEmploye extends AbstractIDaoGenericImpl<Employe, Long> implements IDaoEmploye {

	public DaoEmploye() {
		super(Employe.class);
	}

	@Override
	public void addEmployeeToGroup(Employe employe, Groupe groupe) {

		entityTransaction.begin();

		employe.getListeGroupes().add(groupe);

		update(employe);

		entityTransaction.commit();
	}

	@Override
	public List<Employe> findEmployeeByGroup(Groupe groupe) {

		List<Employe> listeEmployes;

		entityTransaction.begin();

		CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
		CriteriaQuery<Employe> criteriaQuery = criteriaBuilder.createQuery(Employe.class);

		// SELECT e FROM Employe e JOIN e.listeGroupes g WHERE g=:groupe
		Root<Employe> root = criteriaQuery.from(Employe.class);
		Join<Employe, Groupe> join = root.join("listeGroupes");

		ParameterExpression<Groupe> parameterExpression = criteriaBuilder.parameter(Groupe.class);

		criteriaQuery.select(root);
		criteriaQuery.where(criteriaBuilder.equal(parameterExpression, join));

		TypedQuery<Employe> typedQuery = entityManager.createQuery(criteriaQuery);
		typedQuery.setParameter(parameterExpression, groupe);
		listeEmployes = typedQuery.getResultList();

		entityTransaction.commit();

		return listeEmployes;
	}

	@Override
	public Employe findByUtilisateur(Utilisateur utilisateur) {

		Employe employe = null;

		entityTransaction.begin();

		CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
		CriteriaQuery<Employe> criteriaQuery = criteriaBuilder.createQuery(Employe.class);

		// SELECT e FROM Employe e JOIN e.utilisateur g WHERE g=:utilisateur
		Root<Employe> root = criteriaQuery.from(Employe.class);
		Join<Employe, Utilisateur> join = root.join("utilisateur");

		ParameterExpression<Utilisateur> parameterExpression = criteriaBuilder.parameter(Utilisateur.class);

		criteriaQuery.select(root);
		criteriaQuery.where(criteriaBuilder.equal(parameterExpression, join));

		TypedQuery<Employe> typedQuery = entityManager.createQuery(criteriaQuery);
		typedQuery.setParameter(parameterExpression, utilisateur);
		employe = typedQuery.getSingleResult();

		entityTransaction.commit();

		return employe;
	}

	@Override
	public List<Employe> findAll() {
		List<Employe> listeEmployes;

		entityTransaction.begin();

		TypedQuery<Employe> typedQuery = entityManager.createNamedQuery(Employe.FIND_ALL_EMPLOYE, Employe.class);
		listeEmployes = typedQuery.getResultList();

		entityTransaction.commit();

		return listeEmployes;
	}

}
