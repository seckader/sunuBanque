package sn.objis.sunubanque.service;

import java.util.List;

import sn.objis.sunubanque.domaine.Role;
import sn.objis.sunubanque.domaine.Utilisateur;

public interface IServiceRole extends IService<Role> {
	
	public Role findById(Long id);
	
	public Role findByName(String name);
	
	public List<Role> findByUtilisateur(Utilisateur utilisateur);

}
