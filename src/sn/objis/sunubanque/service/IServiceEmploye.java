package sn.objis.sunubanque.service;

import java.util.List;

import sn.objis.sunubanque.domaine.Employe;
import sn.objis.sunubanque.domaine.Groupe;

public interface IServiceEmploye extends IService<Employe> {
	
	public Employe findById(Long id);
	
	/**
	 * Cette m�thode permet d'ajouter un employ� � un groupe.
	 * 
	 * @param employe:
	 *            L'employ� � ajouter au groupe.
	 * @param groupe:
	 *            Le groupe auquel on veut ajouter l'employ�.
	 */
	public void addEmployeeToGroup(Employe employe, Groupe groupe);

	/**
	 * Cette m�thode permet de trouver la liste des employ�s par groupe.
	 * 
	 * @param groupe:
	 *            Le groupe dont on veut voir la liste de ses employ�s.
	 * @return La liste des employ�s du groupe pass� en param�tre. 
	 */
	public List<Employe> findEmployeeByGroup(Groupe groupe);

}
