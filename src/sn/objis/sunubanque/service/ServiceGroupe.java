package sn.objis.sunubanque.service;

import java.util.List;

import sn.objis.sunubanque.dao.DaoGroupe;
import sn.objis.sunubanque.domaine.Employe;
import sn.objis.sunubanque.domaine.Groupe;

public class ServiceGroupe implements IServiceGroupe {

	private DaoGroupe dao;

	public ServiceGroupe() {
		super();
		dao = new DaoGroupe();
	}

	@Override
	public void create(Groupe element) throws Exception {
		dao.create(element);
	}

	@Override
	public void update(Groupe element) {
		dao.update(element);
	}

	@Override
	public void delete(Groupe element) {
		dao.delete(element);
	}

	@Override
	public List<Groupe> findAll() {
		return dao.findAll();
	}

	@Override
	public Groupe findById(Long id) {
		return dao.findById(id);
	}

	@Override
	public List<Groupe> findGroupsOfEmploye(Employe employe) {
		return dao.findGroupsOfEmploye(employe);
	}

}
