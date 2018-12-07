package sn.objis.sunubanque.service;

import java.util.List;

public interface IService<T> {
	
	/**
	 * Cette méthode permet d'ajouter un élément à la base de données.
	 * 
	 * @param element:
	 *            Représente l'élément à ajouter à la base de données.
	 */
	public void create(T element) throws Exception;

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
