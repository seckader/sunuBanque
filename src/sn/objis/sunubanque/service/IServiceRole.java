package sn.objis.sunubanque.service;

import sn.objis.sunubanque.domaine.Role;

public interface IServiceRole extends IService<Role> {
	
	public Role findById(Long id);

}
