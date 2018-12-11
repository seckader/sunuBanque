package sn.objis.sunubanque.service;

import java.util.List;

import sn.objis.sunubanque.dao.DaoEmploye;
import sn.objis.sunubanque.domaine.Employe;
import sn.objis.sunubanque.domaine.Groupe;
import sn.objis.sunubanque.domaine.Utilisateur;

public class ServiceEmploye implements IServiceEmploye {

	private DaoEmploye dao;

	public ServiceEmploye() {
		super();
		dao = new DaoEmploye();
	}

	@Override
	public void create(Employe element) throws Exception {
		dao.create(element);
	}

	@Override
	public void update(Employe element) {
		dao.update(element);
	}

	@Override
	public void delete(Employe element) {
		dao.delete(element);
	}

	@Override
	public List<Employe> findAll() {
		return dao.findAll();
	}

	@Override
	public Employe findById(Long id) {
		return dao.findById(id);
	}

	@Override
	public void addEmployeeToGroup(Employe employe, Groupe groupe) {
		dao.addEmployeeToGroup(employe, groupe);
	}

	@Override
	public List<Employe> findEmployeeByGroup(Groupe groupe) {
		return dao.findEmployeeByGroup(groupe);
	}

	@Override
	public Employe findByUtilisateur(Utilisateur utilisateur) {
		return dao.findByUtilisateur(utilisateur);
	}

}
