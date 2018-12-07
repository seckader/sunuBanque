package sn.objis.sunubanque.service;

import java.util.List;

import sn.objis.sunubanque.dao.DaoOperation;
import sn.objis.sunubanque.domaine.Operation;

public class ServiceOperation implements IServiceOperation {

	private DaoOperation dao;

	public ServiceOperation() {
		super();
		dao = new DaoOperation();
	}

	@Override
	public void create(Operation element) throws Exception {
		dao.create(element);
	}

	@Override
	public void update(Operation element) {
		dao.update(element);
	}

	@Override
	public void delete(Operation element) {
		dao.delete(element);
	}

	@Override
	public List<Operation> findAll() {
		return dao.findAll();
	}

	@Override
	public Operation findById(Long id) {
		return dao.findById(id);
	}

}
