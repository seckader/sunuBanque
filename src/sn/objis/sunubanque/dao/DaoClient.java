package sn.objis.sunubanque.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import sn.objis.sunubanque.domaine.Client;

/**
 * Cette classe propose une impl�mentation pour les m�thodes d'interaction avec
 * la base de donn�es sp�cifiques � l'entit� Client.
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
