package sn.objis.sunubanque.dao;

import sn.objis.sunubanque.domaine.Groupe;

/**
 * Cette classe propose une impl�mentation pour les m�thodes d'interaction avec
 * la base de donn�es sp�cifiques � l'entit� Groupe.
 * 
 * @author Kader
 *
 */
public class DaoGroupe extends AbstractIDaoGenericImpl<Groupe, Long> implements IDaoGroupe {

	public DaoGroupe() {
		super(Groupe.class);
	}

}
