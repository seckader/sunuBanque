package sn.objis.sunubanque.service;

import java.util.List;

import sn.objis.sunubanque.domaine.Client;
import sn.objis.sunubanque.domaine.CompteBancaire;
import sn.objis.sunubanque.domaine.Employe;

public interface IServiceCompteBancaire extends IService<CompteBancaire> {
	
	public CompteBancaire findById(Long id);

	/**
	 * Cette méthode permet de trouver la liste de tous les comptes bancaires d'un
	 * client.
	 * 
	 * @param client
	 * @return
	 */
	public List<CompteBancaire> findCompteByClient(Client client);

	/**
	 * Cette méthode permet de touver la liste de tous les comptes bancaires créés
	 * par un employé.
	 * 
	 * @param employe
	 * @return
	 */
	public List<CompteBancaire> findCompteByEmploye(Employe employe);
	
}
