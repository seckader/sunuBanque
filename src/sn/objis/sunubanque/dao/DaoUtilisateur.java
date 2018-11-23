package sn.objis.sunubanque.dao;

import sn.objis.sunubanque.domaine.Utilisateur;

/**
 * Cette classe propose une impl�mentation pour les m�thodes d'interaction avec
 * la base de donn�es sp�cifiques � l'entit� Utilisateur.
 * 
 * @author Kader
 *
 */
public class DaoUtilisateur extends AbstractIDaoGenericImpl<Utilisateur, Long> implements IDaoUtilisateur {

	public DaoUtilisateur() {
		super(Utilisateur.class);
	}

}
