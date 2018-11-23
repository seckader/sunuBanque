package sn.objis.sunubanque.dao;

import sn.objis.sunubanque.domaine.Groupe;

/**
 * Cette classe propose une implémentation pour les méthodes d'interaction avec
 * la base de données spécifiques à l'entité Groupe.
 * 
 * @author Kader
 *
 */
public class DaoGroupe extends AbstractIDaoGenericImpl<Groupe, Long> implements IDaoGroupe {

	public DaoGroupe() {
		super(Groupe.class);
	}

}
