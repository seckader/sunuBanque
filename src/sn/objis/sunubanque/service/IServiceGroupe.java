package sn.objis.sunubanque.service;

import java.util.List;

import sn.objis.sunubanque.domaine.Employe;
import sn.objis.sunubanque.domaine.Groupe;

public interface IServiceGroupe extends IService<Groupe> {
	
	public Groupe findById(Long id);
	
	/**
	 * Cette méthode permet de trouver les groupes d'un employé.
	 * 
	 * @param employe: L'employé dont on veut connaitre la liste de ses groupes.
	 * @return la liste des groupes de l'employé passé en paramètre.
	 */
	public List<Groupe> findGroupsOfEmploye(Employe employe);

}
