package sn.objis.sunubanque.dao;

import java.util.List;

import sn.objis.sunubanque.domaine.Utilisateur;

/**
 * Interface exposant les m�thodes d'interaction avec la base de donn�es de
 * l'entit� Utilisateur.
 * 
 * @author Kader
 *
 */
public interface IDaoUtilisateur extends IDaoGeneric<Utilisateur, Long> {

	/**
	 * Cette m�thode permet de r�cup�rer l'ensemble des enregistrements se trouvant
	 * dans la base de donn�es.
	 * 
	 * @return
	 */
	public List<Utilisateur> findAll();
	
	public Utilisateur seConnecter(String login, String password);
	
	public Utilisateur findByLogin(String login);
}
