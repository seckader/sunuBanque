package sn.objis.sunubanque.dao;

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

}
