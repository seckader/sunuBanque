package sn.objis.sunubanque.dao;

import java.util.List;

import sn.objis.sunubanque.domaine.Client;

/**
 * Interface exposant les méthodes d'interaction avec la base de données de
 * l'entité Client.
 * 
 * @author Kader
 *
 */
public interface IDaoClient extends IDaoGeneric<Client, Long> {

	/**
	 * Cette méthode permet de récupérer l'ensemble des enregistrements se trouvant
	 * dans la base de données.
	 * 
	 * @return
	 */
	public List<Client> findAll();
}
