package sn.objis.sunubanque.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import sn.objis.sunubanque.domaine.Client;

/**
 * Cette classe propose une implémentation pour les méthodes d'interaction avec
 * la base de données spécifiques à l'entité Client.
 * 
 * @author Kader
 *
 */
public class DaoClient extends AbstractIDaoGenericImpl<Client, Long> implements IDaoClient {

	public DaoClient() {
		super(Client.class);
	}

	@Override
	public List<Client> findAll() {
		
		List<Client> listeClients;
		
		entityTransaction.begin();
		
		TypedQuery<Client> typedQuery = entityManager.createNamedQuery(Client.FIND_ALL_CLIENTS, Client.class);
		listeClients = typedQuery.getResultList();
		
		entityTransaction.commit();
		
		return listeClients;
	}

}
