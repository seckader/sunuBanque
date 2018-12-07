package sn.objis.sunubanque.service;

import java.util.List;

public interface IService<T> {
	
	/**
	 * Cette m�thode permet d'ajouter un �l�ment � la base de donn�es.
	 * 
	 * @param element:
	 *            Repr�sente l'�l�ment � ajouter � la base de donn�es.
	 */
	public void create(T element) throws Exception;

	/**
	 * Cette m�thode permet de mettre � jour les donn�es d'un �l�ment se trouvant
	 * dans la base de donn�es.
	 * 
	 * @param element:
	 *            Repr�sente l'�l�ment que l'on veut mettre � jour.
	 */
	public void update(T element);

	/**
	 * Cette m�thode permet de supprimer un �l�ment de la base de donn�es.
	 * 
	 * @param element:
	 *            Repr�sente l'�l�ment que l'on veut supprimer.
	 */
	public void delete(T element);

	/**
	 * Cette m�thode permet de r�cup�rer l'ensemble des enregistrements se trouvant
	 * dans la base de donn�es.
	 * 
	 * @return
	 */
	public List<T> findAll();

}
