package sn.objis.sunubanque.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import sn.objis.sunubanque.domaine.Role;
import sn.objis.sunubanque.domaine.Utilisateur;

/**
 * Cette classe propose une implémentation pour les méthodes d'interaction avec
 * la base de données spécifiques à l'entité Role.
 * 
 * @author Kader
 *
 */
public class DaoRole extends AbstractIDaoGenericImpl<Role, Long> implements IDaoRole {

	public DaoRole() {
		super(Role.class);
	}

	@Override
	public Role findByName(String name) {

		Role role = null;

		entityTransaction.begin();

		String requeteJPQL = "SELECT r FROM Role r WHERE r.nom = :nom";
		TypedQuery<Role> typedQuery = entityManager.createQuery(requeteJPQL, Role.class);
		typedQuery.setParameter("nom", name);
		role = typedQuery.getSingleResult();

		entityTransaction.commit();

		return role;
	}

	@Override
	public List<Role> findByUtilisateur(Utilisateur utilisateur) {

		List<Role> listeRoles;

		entityTransaction.begin();

		// SELECT r FROM Utilisateur u JOIN u.listeRoles r
		String requeteJPQL = "SELECT r FROM Utilisateur u JOIN u.listeRoles r WHERE u = :utilisateur";
		TypedQuery<Role> typedQuery = entityManager.createQuery(requeteJPQL, Role.class);
		typedQuery.setParameter("utilisateur", utilisateur);
		listeRoles = typedQuery.getResultList();

		entityTransaction.commit();

		return listeRoles;
	}

	@Override
	public List<Role> findAll() {
		List<Role> listeRoles;

		entityTransaction.begin();

		TypedQuery<Role> typedQuery = entityManager.createNamedQuery(Role.FIND_ALL_ROLE, Role.class);
		listeRoles = typedQuery.getResultList();

		entityTransaction.commit();

		return listeRoles;
	}

}
