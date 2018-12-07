package sn.objis.sunubanque.dao;

import java.util.List;

import javax.persistence.Query;

import sn.objis.sunubanque.domaine.Client;
import sn.objis.sunubanque.domaine.CompteBancaire;
import sn.objis.sunubanque.domaine.Employe;

/**
 * Cette classe propose une impl�mentation pour les m�thodes d'interaction avec
 * la base de donn�es sp�cifiques � l'entit� CompteBancaire.
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

}
