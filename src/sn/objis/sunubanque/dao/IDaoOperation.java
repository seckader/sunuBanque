package sn.objis.sunubanque.dao;

import java.util.List;

import sn.objis.sunubanque.domaine.Operation;

/**
 * Interface exposant les m�thodes d'interaction avec la base de donn�es de
 * l'entit� Op�ration.
 * 
 * @author Kader
 *
 */
public interface IDaoOperation extends IDaoGeneric<Operation, Long> {

	/**
	 * Cette m�thode permet de r�cup�rer l'ensemble des enregistrements se trouvant
	 * dans la base de donn�es.
	 * 
	 * @return
	 */
	public List<Operation> findAll();
}
