package sn.objis.sunubanque.service;

import java.util.List;

import sn.objis.sunubanque.domaine.Employe;
import sn.objis.sunubanque.domaine.Groupe;

public interface IServiceGroupe extends IService<Groupe> {
	
	public Groupe findById(Long id);
	
	/**
	 * Cette m�thode permet de trouver les groupes d'un employ�.
	 * 
	 * @param employe: L'employ� dont on veut connaitre la liste de ses groupes.
	 * @return la liste des groupes de l'employ� pass� en param�tre.
	 */
	public List<Groupe> findGroupsOfEmploye(Employe employe);

}
