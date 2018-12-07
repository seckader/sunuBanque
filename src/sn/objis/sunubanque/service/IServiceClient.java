package sn.objis.sunubanque.service;

import sn.objis.sunubanque.domaine.Client;

public interface IServiceClient extends IService<Client> {
	
	/**
	 * Cette méthode permet trouver un élément à partir de son identifiant.
	 * 
	 * @param id:
	 *            Représente l'identifiant de l'élément que l'on veut trouver.
	 * @return
	 */
	public Client findById(Long id);

}
