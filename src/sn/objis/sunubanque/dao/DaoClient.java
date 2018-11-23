package sn.objis.sunubanque.dao;

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

}
