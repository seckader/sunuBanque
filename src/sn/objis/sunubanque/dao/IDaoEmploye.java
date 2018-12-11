package sn.objis.sunubanque.dao;

import java.util.List;

import sn.objis.sunubanque.domaine.Employe;
import sn.objis.sunubanque.domaine.Groupe;
import sn.objis.sunubanque.domaine.Utilisateur;

/**
 * Interface exposant les m�thodes d'interaction avec la base de donn�es de
 * l'entit� Employ�.
 * 
 * @author Kader
 *
 */
public interface IDaoEmploye extends IDaoGeneric<Employe, Long> {

	/**
	 * Cette m�thode permet de r�cup�rer l'ensemble des enregistrements se trouvant
	 * dans la base de donn�es.
	 * 
	 * @return
	 */
	public List<Employe> findAll();

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

	public Employe findByUtilisateur(Utilisateur utilisateur);

}
