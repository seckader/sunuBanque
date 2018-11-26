package sn.objis.sunubanque.dao;

import java.util.List;

import javax.ws.rs.client.Client;

import sn.objis.sunubanque.domaine.CompteBancaire;
import sn.objis.sunubanque.domaine.Employe;

/**
 * Interface exposant les méthodes d'interaction avec la base de données de
 * l'entité CompteBancaire.
 * 
 * @author Kader
 *
 */
public interface IDaoCompteBancaire extends IDaoGeneric<CompteBancaire, Long> {

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
