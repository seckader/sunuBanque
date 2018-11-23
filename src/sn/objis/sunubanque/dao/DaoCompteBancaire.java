package sn.objis.sunubanque.dao;

import sn.objis.sunubanque.domaine.CompteBancaire;

/**
 * Cette classe propose une implémentation pour les méthodes d'interaction avec
 * la base de données spécifiques à l'entité CompteBancaire.
 * 
 * @author Kader
 *
 */
public class DaoCompteBancaire extends AbstractIDaoGenericImpl<CompteBancaire, Long> implements IDaoCompteBancaire {

	public DaoCompteBancaire() {
		super(CompteBancaire.class);
	}

}
