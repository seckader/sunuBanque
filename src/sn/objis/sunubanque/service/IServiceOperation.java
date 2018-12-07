package sn.objis.sunubanque.service;

import sn.objis.sunubanque.domaine.Operation;

public interface IServiceOperation extends IService<Operation> {
	
	public Operation findById(Long id);

}
