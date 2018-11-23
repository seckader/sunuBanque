package sn.objis.sunubanque.dao;

import sn.objis.sunubanque.domaine.Utilisateur;

/**
 * Cette classe propose une implémentation pour les méthodes d'interaction avec
 * la base de données spécifiques à l'entité Utilisateur.
 * 
 * @author Kader
 *
 */
public class DaoUtilisateur extends AbstractIDaoGenericImpl<Utilisateur, Long> implements IDaoUtilisateur {

	public DaoUtilisateur() {
		super(Utilisateur.class);
	}

}
