package sn.objis.sunubanque.dao;

import java.util.List;

import sn.objis.sunubanque.domaine.Role;
import sn.objis.sunubanque.domaine.Utilisateur;

/**
 * Interface exposant les méthodes d'interaction avec la base de données de
 * l'entité Role.
 * 
 * @author Kader
 *
 */
public interface IDaoRole extends IDaoGeneric<Role, Long> {
	
	/**
	 * Cette méthode permet de récupérer l'ensemble des enregistrements se trouvant
	 * dans la base de données.
	 * 
	 * @return
	 */
	public List<Role> findAll();
	
	public Role findByName(String name);
	
	public List<Role> findByUtilisateur(Utilisateur utilisateur);

}
