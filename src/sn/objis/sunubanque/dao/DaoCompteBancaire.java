package sn.objis.sunubanque.dao;

import sn.objis.sunubanque.domaine.CompteBancaire;

/**
 * Cette classe propose une impl�mentation pour les m�thodes d'interaction avec
 * la base de donn�es sp�cifiques � l'entit� CompteBancaire.
 * 
 * @author Kader
 *
 */
public class DaoCompteBancaire extends AbstractIDaoGenericImpl<CompteBancaire, Long> implements IDaoCompteBancaire {

	public DaoCompteBancaire() {
		super(CompteBancaire.class);
	}

}
