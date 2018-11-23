package sn.objis.sunubanque.dao;

import sn.objis.sunubanque.domaine.Employe;

/**
 * Cette classe propose une implémentation pour les méthodes d'interaction avec
 * la base de données spécifiques à l'entité Employe.
 * 
 * @author Kader
 *
 */
public class DaoEmploye extends AbstractIDaoGenericImpl<Employe, Long> implements IDaoEmploye {

	public DaoEmploye() {
		super(Employe.class);
	}

}
