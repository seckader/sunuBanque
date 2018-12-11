package sn.objis.sunubanque.dao;

import java.util.List;

import sn.objis.sunubanque.domaine.Role;
import sn.objis.sunubanque.domaine.Utilisateur;

/**
 * Interface exposant les m�thodes d'interaction avec la base de donn�es de
 * l'entit� Role.
 * 
 * @author Kader
 *
 */
public interface IDaoRole extends IDaoGeneric<Role, Long> {
	
	/**
	 * Cette m�thode permet de r�cup�rer l'ensemble des enregistrements se trouvant
	 * dans la base de donn�es.
	 * 
	 * @return
	 */
	public List<Role> findAll();
	
	public Role findByName(String name);
	
	public List<Role> findByUtilisateur(Utilisateur utilisateur);

}
