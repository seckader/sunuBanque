package sn.objis.sunubanque.dao;

import java.io.Serializable;
import java.util.List;

/**
 * Cette interface présente les méthodes CRUD permettant de manipuler les objets
 * du domaine.
 * 
 * @author Kader
 *
 * @param <T>:
 *            Représente les entités mappées en relationnel.
 * @param <K>:
 *            Représente les clés primaires des entités.
 */
public interface IDaoGeneric<T, K extends Serializable> {

	/**
	 * Cette méthode permet d'ajouter un élément à la base de données.
	 * 
	 * @param element:
	 *            Représente l'élément à ajouter à la base de données.
	 */
	public void create(T element);

	/**
	 * Cette méthode permet trouver un élément à partir de son identifiant.
	 * 
	 * @param id:
	 *            Représente l'identifiant de l'élément que l'on veut trouver.
	 * @return
	 */
	public T findById(K id);

	/**
	 * Cette méthode permet de mettre à jour les données d'un élément se trouvant
	 * dans la base de données.
	 * 
	 * @param element:
	 *            Représente l'élément que l'on veut mettre à jour.
	 */
	public void update(T element);

	/**
	 * Cette méthode permet de supprimer un élément de la base de données.
	 * 
	 * @param element:
	 *            Représente l'élément que l'on veut supprimer.
	 */
	public void delete(T element);

	/**
	 * Cette méthode permet de récupérer l'ensemble des enregistrements se trouvant
	 * dans la base de données.
	 * 
	 * @return
	 */
	public List<T> findAll();

}
