package sn.objis.sunubanque.service;

import sn.objis.sunubanque.domaine.Client;

public interface IServiceClient extends IService<Client> {
	
	/**
	 * Cette m�thode permet trouver un �l�ment � partir de son identifiant.
	 * 
	 * @param id:
	 *            Repr�sente l'identifiant de l'�l�ment que l'on veut trouver.
	 * @return
	 */
	public Client findById(Long id);

}
