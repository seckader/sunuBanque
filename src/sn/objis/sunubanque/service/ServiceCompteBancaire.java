package sn.objis.sunubanque.service;

import java.util.List;

import sn.objis.sunubanque.dao.DaoCompteBancaire;
import sn.objis.sunubanque.domaine.Client;
import sn.objis.sunubanque.domaine.CompteBancaire;
import sn.objis.sunubanque.domaine.Employe;

public class ServiceCompteBancaire implements IServiceCompteBancaire {

	private DaoCompteBancaire dao;

	public ServiceCompteBancaire() {
		super();
		dao = new DaoCompteBancaire();
	}

	@Override
	public void create(CompteBancaire element) throws Exception {
		dao.create(element);
	}

	@Override
	public void update(CompteBancaire element) {
		dao.update(element);
	}

	@Override
	public void delete(CompteBancaire element) {
		dao.delete(element);
	}

	@Override
	public List<CompteBancaire> findAll() {
		return dao.findAll();
	}

	@Override
	public CompteBancaire findById(Long id) {
		return dao.findById(id);
	}

	@Override
	public List<CompteBancaire> findCompteByClient(Client client) {
		return dao.findCompteByClient(client);
	}

	@Override
	public List<CompteBancaire> findCompteByEmploye(Employe employe) {
		return dao.findCompteByEmploye(employe);
	}

}
