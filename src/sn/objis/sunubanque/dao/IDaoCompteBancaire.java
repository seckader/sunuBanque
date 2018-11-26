package sn.objis.sunubanque.dao;

import java.util.List;

import javax.ws.rs.client.Client;

import sn.objis.sunubanque.domaine.CompteBancaire;
import sn.objis.sunubanque.domaine.Employe;

/**
 * Interface exposant les m�thodes d'interaction avec la base de donn�es de
 * l'entit� CompteBancaire.
 * 
 * @author Kader
 *
 */
public interface IDaoCompteBancaire extends IDaoGeneric<CompteBancaire, Long> {

	/**
	 * Cette m�thode permet de trouver la liste de tous les comptes bancaires d'un
	 * client.
	 * 
	 * @param client
	 * @return
	 */
	public List<CompteBancaire> findCompteByClient(Client client);

	/**
	 * Cette m�thode permet de touver la liste de tous les comptes bancaires cr��s
	 * par un employ�.
	 * 
	 * @param employe
	 * @return
	 */
	public List<CompteBancaire> findCompteByEmploye(Employe employe);
}
