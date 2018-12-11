package sn.objis.sunubanque.dao;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.TypedQuery;

import sn.objis.sunubanque.domaine.Client;
import sn.objis.sunubanque.domaine.CompteBancaire;
import sn.objis.sunubanque.domaine.Employe;

/**
 * Cette classe propose une implémentation pour les méthodes d'interaction avec
 * la base de données spécifiques à l'entité CompteBancaire.
 * 
 * @author Kader
 *
 */
public class DaoCompteBancaire extends AbstractIDaoGenericImpl<CompteBancaire, Long> implements IDaoCompteBancaire {

	public DaoCompteBancaire() {
		super(CompteBancaire.class);
	}

	@Override
	public List<CompteBancaire> findCompteByClient(Client client) {

		List<CompteBancaire> listeComptesBancaires;

		entityTransaction.begin();

		Query query = entityManager.createNamedQuery(CompteBancaire.FIND_ALL_COMPTE_BY_CLIENT);
		query.setParameter("client", client);

		listeComptesBancaires = query.getResultList();

		entityTransaction.commit();

		return listeComptesBancaires;
	}

	@Override
	public List<CompteBancaire> findCompteByEmploye(Employe employe) {

		List<CompteBancaire> listeComptesBancaires;

		entityTransaction.begin();

		Query query = entityManager.createNamedQuery(CompteBancaire.FIND_ALL_COMPTE_BY_EMPLOYE);
		query.setParameter("employe", employe);

		listeComptesBancaires = query.getResultList();

		entityTransaction.commit();

		return listeComptesBancaires;
	}

	@Override
	public List<CompteBancaire> findAll() {
		List<CompteBancaire> listeCompteBancaires;

		entityTransaction.begin();

		Query query = entityManager.createNamedQuery(CompteBancaire.FIND_ALL_COMPTE);
		listeCompteBancaires = query.getResultList();

		entityTransaction.commit();

		return listeCompteBancaires;
	}

	@Override
	public CompteBancaire findByNumeroCompte(String numeroCompte) {

		CompteBancaire compteBancaire = null;
		
		entityTransaction.begin();
		
		String requeteJPQL = "SELECT c FROM CompteBancaire c WHERE c.numeroCompte = :numeroCompte";
		Query query = entityManager.createQuery(requeteJPQL);
		query.setParameter("numeroCompte", numeroCompte);
		compteBancaire = (CompteBancaire) query.getSingleResult();
		
		entityTransaction.commit();
		
		return compteBancaire;
	}

}
