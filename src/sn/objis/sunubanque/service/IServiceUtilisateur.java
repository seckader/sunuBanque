package sn.objis.sunubanque.service;

import sn.objis.sunubanque.domaine.Utilisateur;

public interface IServiceUtilisateur extends IService<Utilisateur> {
	
	public Utilisateur findById(Long id);

}
