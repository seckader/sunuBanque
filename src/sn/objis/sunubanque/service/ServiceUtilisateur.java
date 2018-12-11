package sn.objis.sunubanque.service;

import java.util.List;

import sn.objis.sunubanque.dao.DaoUtilisateur;
import sn.objis.sunubanque.domaine.Utilisateur;

public class ServiceUtilisateur implements IServiceUtilisateur {

	private DaoUtilisateur dao;

	public ServiceUtilisateur() {
		super();
		dao = new DaoUtilisateur();
	}

	@Override
	public void create(Utilisateur element) throws Exception {
		dao.create(element);
	}

	@Override
	public void update(Utilisateur element) {
		dao.update(element);
	}

	@Override
	public void delete(Utilisateur element) {
		dao.delete(element);
	}

	@Override
	public List<Utilisateur> findAll() {
		return dao.findAll();
	}

	@Override
	public Utilisateur findById(Long id) {
		return dao.findById(id);
	}

	@Override
	public Utilisateur seConnecter(String login, String password) {
		return dao.seConnecter(login, password);
	}

	@Override
	public Utilisateur findByLogin(String login) {
		return dao.findByLogin(login);
	}

}
