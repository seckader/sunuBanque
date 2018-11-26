package sn.objis.sunubanque.dao;

import java.util.List;

import sn.objis.sunubanque.domaine.Employe;
import sn.objis.sunubanque.domaine.Groupe;

/**
 * Interface exposant les m�thodes d'interaction avec la base de donn�es de
 * l'entit� Groupe.
 * 
 * @author Kader
 *
 */
public interface IDaoGroupe extends IDaoGeneric<Groupe, Long> {

	/**
	 * Cette m�thode permet de trouver les groupes d'un employ�.
	 * 
	 * @param employe: L'employ� dont on veut connaitre la liste de ses groupes.
	 * @return la liste des groupes de l'employ� pass� en param�tre.
	 */
	public List<Groupe> findGroupsOfEmploye(Employe employe);

}
