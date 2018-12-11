package sn.objis.sunubanque.dao;

import java.util.List;

import sn.objis.sunubanque.domaine.Operation;

/**
 * Interface exposant les méthodes d'interaction avec la base de données de
 * l'entité Opération.
 * 
 * @author Kader
 *
 */
public interface IDaoOperation extends IDaoGeneric<Operation, Long> {

	/**
	 * Cette méthode permet de récupérer l'ensemble des enregistrements se trouvant
	 * dans la base de données.
	 * 
	 * @return
	 */
	public List<Operation> findAll();
}
