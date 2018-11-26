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
		
		employe.getListeGroupes().add(groupe);
		
		update(employe);
	}

	@Override
	public List<Employe> findEmployeeByGroup(Groupe groupe) {
		
		List<Employe> listeEmployes;
		
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
		
		return listeEmployes;
	}

}
