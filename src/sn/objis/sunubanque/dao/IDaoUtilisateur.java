package sn.objis.sunubanque.dao;

import java.util.List;

import sn.objis.sunubanque.domaine.Utilisateur;

/**
 * Interface exposant les méthodes d'interaction avec la base de données de
 * l'entité Utilisateur.
 * 
 * @author Kader
 *
 */
public interface IDaoUtilisateur extends IDaoGeneric<Utilisateur, Long> {

	/**
	 * Cette méthode permet de récupérer l'ensemble des enregistrements se trouvant
	 * dans la base de données.
	 * 
	 * @return
	 */
	public List<Utilisateur> findAll();
	
	public Utilisateur seConnecter(String login, String password);
	
	public Utilisateur findByLogin(String login);
}
