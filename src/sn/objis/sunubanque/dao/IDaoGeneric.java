package sn.objis.sunubanque.dao;

import java.io.Serializable;
import java.util.List;

/**
 * Cette interface pr�sente les m�thodes CRUD permettant de manipuler les objets
 * du domaine.
 * 
 * @author Kader
 *
 * @param <T>:
 *            Repr�sente les entit�s mapp�es en relationnel.
 * @param <K>:
 *            Repr�sente les cl�s primaires des entit�s.
 */
public interface IDaoGeneric<T, K extends Serializable> {

	/**
	 * Cette m�thode permet d'ajouter un �l�ment � la base de donn�es.
	 * 
	 * @param element:
	 *            Repr�sente l'�l�ment � ajouter � la base de donn�es.
	 */
	public void create(T element);

	/**
	 * Cette m�thode permet trouver un �l�ment � partir de son identifiant.
	 * 
	 * @param id:
	 *            Repr�sente l'identifiant de l'�l�ment que l'on veut trouver.
	 * @return
	 */
	public T findById(K id);

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
