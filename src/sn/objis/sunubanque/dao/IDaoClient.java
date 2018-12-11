package sn.objis.sunubanque.dao;

import java.util.List;

import sn.objis.sunubanque.domaine.Client;

/**
 * Interface exposant les m�thodes d'interaction avec la base de donn�es de
 * l'entit� Client.
 * 
 * @author Kader
 *
 */
public interface IDaoClient extends IDaoGeneric<Client, Long> {

	/**
	 * Cette m�thode permet de r�cup�rer l'ensemble des enregistrements se trouvant
	 * dans la base de donn�es.
	 * 
	 * @return
	 */
	public List<Client> findAll();
}
