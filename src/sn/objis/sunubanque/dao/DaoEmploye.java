package sn.objis.sunubanque.dao;

import sn.objis.sunubanque.domaine.Employe;

/**
 * Cette classe propose une impl�mentation pour les m�thodes d'interaction avec
 * la base de donn�es sp�cifiques � l'entit� Employe.
 * 
 * @author Kader
 *
 */
public class DaoEmploye extends AbstractIDaoGenericImpl<Employe, Long> implements IDaoEmploye {

	public DaoEmploye() {
		super(Employe.class);
	}

}
