package sn.objis.sunubanque.service;

import java.util.List;

import sn.objis.sunubanque.domaine.Employe;
import sn.objis.sunubanque.domaine.Groupe;

public interface IServiceEmploye extends IService<Employe> {
	
	public Employe findById(Long id);
	
	/**
	 * Cette méthode permet d'ajouter un employé à un groupe.
	 * 
	 * @param employe:
	 *            L'employé à ajouter au groupe.
	 * @param groupe:
	 *            Le groupe auquel on veut ajouter l'employé.
	 */
	public void addEmployeeToGroup(Employe employe, Groupe groupe);

	/**
	 * Cette méthode permet de trouver la liste des employés par groupe.
	 * 
	 * @param groupe:
	 *            Le groupe dont on veut voir la liste de ses employés.
	 * @return La liste des employés du groupe passé en paramètre. 
	 */
	public List<Employe> findEmployeeByGroup(Groupe groupe);

}
