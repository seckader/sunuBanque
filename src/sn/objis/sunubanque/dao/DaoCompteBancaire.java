package sn.objis.sunubanque.dao;

import java.util.List;

import javax.persistence.Query;
import javax.ws.rs.client.Client;

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

		Query query = entityManager.createNamedQuery(CompteBancaire.FIND_ALL_COMPTE_BY_CLIENT);
		query.setParameter("client", client);

		listeComptesBancaires = query.getResultList();

		return listeComptesBancaires;
	}

	@Override
	public List<CompteBancaire> findCompteByEmploye(Employe employe) {
		
		List<CompteBancaire> listeComptesBancaires;
		
		Query query = entityManager.createNamedQuery(CompteBancaire.FIND_ALL_COMPTE_BY_EMPLOYE);
		query.setParameter("employe", employe);
		
		listeComptesBancaires = query.getResultList();
		
		return listeComptesBancaires;
	}

}
