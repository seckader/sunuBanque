package sn.objis.sunubanque.dao;

import sn.objis.sunubanque.domaine.Role;

/**
 * Cette classe propose une impl�mentation pour les m�thodes d'interaction avec
 * la base de donn�es sp�cifiques � l'entit� Role.
 * 
 * @author Kader
 *
 */
public class DaoRole extends AbstractIDaoGenericImpl<Role, Long> implements IDaoRole {

	public DaoRole() {
		super(Role.class);
	}

}
