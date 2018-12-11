package sn.objis.sunubanque.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import sn.objis.sunubanque.domaine.Utilisateur;

/**
 * Cette classe propose une implémentation pour les méthodes d'interaction avec
 * la base de données spécifiques à l'entité Utilisateur.
 * 
 * @author Kader
 *
 */
public class DaoUtilisateur extends AbstractIDaoGenericImpl<Utilisateur, Long> implements IDaoUtilisateur {

	public DaoUtilisateur() {
		super(Utilisateur.class);
	}

	@Override
	public Utilisateur seConnecter(String login, String password) {
		Utilisateur utilisateur = null;

		entityTransaction.begin();

		String requeteJPQL = "SELECT u FROM Utilisateur u WHERE u.login = :login AND u.password = :password";
		TypedQuery<Utilisateur> typedQuery = entityManager.createQuery(requeteJPQL, Utilisateur.class);
		typedQuery.setParameter("login", login);
		typedQuery.setParameter("password", password);
		utilisateur = typedQuery.getSingleResult();

		entityTransaction.commit();

		return utilisateur;
	}

	@Override
	public List<Utilisateur> findAll() {
		List<Utilisateur> listeUtilisateurs;

		entityTransaction.begin();

		TypedQuery<Utilisateur> typedQuery = entityManager.createNamedQuery(Utilisateur.FIND_ALL_Utilisateur, Utilisateur.class);
		listeUtilisateurs = typedQuery.getResultList();

		entityTransaction.commit();

		return listeUtilisateurs;
	}

	@Override
	public Utilisateur findByLogin(String login) {
		Utilisateur utilisateur = null;

		entityTransaction.begin();

		String requeteJPQL = "SELECT u FROM Utilisateur u WHERE u.login = :login";
		TypedQuery<Utilisateur> typedQuery = entityManager.createQuery(requeteJPQL, Utilisateur.class);
		typedQuery.setParameter("login", login);
		utilisateur = typedQuery.getSingleResult();

		entityTransaction.commit();

		return utilisateur;
	}

}
