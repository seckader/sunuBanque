package sn.objis.sunubanque.dao;

import java.util.List;

import sn.objis.sunubanque.domaine.Employe;
import sn.objis.sunubanque.domaine.Groupe;

/**
 * Interface exposant les méthodes d'interaction avec la base de données de
 * l'entité Groupe.
 * 
 * @author Kader
 *
 */
public interface IDaoGroupe extends IDaoGeneric<Groupe, Long> {

	/**
	 * Cette méthode permet de trouver les groupes d'un employé.
	 * 
	 * @param employe: L'employé dont on veut connaitre la liste de ses groupes.
	 * @return la liste des groupes de l'employé passé en paramètre.
	 */
	public List<Groupe> findGroupsOfEmploye(Employe employe);

}
