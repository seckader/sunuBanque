package sn.objis.sunubanque.dao;

import sn.objis.sunubanque.domaine.Role;

/**
 * Cette classe propose une implémentation pour les méthodes d'interaction avec
 * la base de données spécifiques à l'entité Role.
 * 
 * @author Kader
 *
 */
public class DaoRole extends AbstractIDaoGenericImpl<Role, Long> implements IDaoRole {

	public DaoRole() {
		super(Role.class);
	}

}
