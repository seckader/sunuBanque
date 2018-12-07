package sn.objis.sunubanque.service;

import java.util.List;

import sn.objis.sunubanque.dao.DaoClient;
import sn.objis.sunubanque.domaine.Client;

public class ServiceClient implements IServiceClient {

	private DaoClient dao;

	public ServiceClient() {
		super();
		dao = new DaoClient();
	}

	@Override
	public void create(Client element) throws Exception {
		dao.create(element);
	}

	@Override
	public void update(Client element) {
		dao.update(element);
	}

	@Override
	public void delete(Client element) {
		dao.delete(element);
	}

	@Override
	public List<Client> findAll() {
		return dao.findAll();
	}

	@Override
	public Client findById(Long id) {
		return dao.findById(id);
	}

}
