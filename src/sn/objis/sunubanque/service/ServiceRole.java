package sn.objis.sunubanque.service;

import java.util.List;

import sn.objis.sunubanque.dao.DaoRole;
import sn.objis.sunubanque.domaine.Role;

public class ServiceRole implements IServiceRole {

	private DaoRole dao;

	public ServiceRole() {
		super();
		dao = new DaoRole();
	}

	@Override
	public void create(Role element) throws Exception {
		dao.create(element);
	}

	@Override
	public void update(Role element) {
		dao.update(element);
	}

	@Override
	public void delete(Role element) {
		dao.delete(element);
	}

	@Override
	public List<Role> findAll() {
		return dao.findAll();
	}

	@Override
	public Role findById(Long id) {
		return dao.findById(id);
	}

}
