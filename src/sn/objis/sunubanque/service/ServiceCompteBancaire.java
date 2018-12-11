package sn.objis.sunubanque.service;

import java.util.List;

import sn.objis.sunubanque.dao.DaoCompteBancaire;
import sn.objis.sunubanque.domaine.Client;
import sn.objis.sunubanque.domaine.CompteBancaire;
import sn.objis.sunubanque.domaine.CompteCourant;
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

	@Override
	public CompteBancaire findByNumeroCompte(String numeroCompte) {
		return dao.findByNumeroCompte(numeroCompte);
	}

	@Override
	public boolean versement(CompteBancaire compteBancaire, double montant) {

		compteBancaire.setSolde(compteBancaire.getSolde() + montant);
		dao.update(compteBancaire);

		return true;
	}

	@Override
	public boolean retrait(CompteBancaire compteBancaire, double montant) {

		boolean isOK = false;
		
		if (compteBancaire.getTypeCompte().equals("Courant")) {
			CompteCourant compteCourant = (CompteCourant) compteBancaire;
			if ((compteCourant.getSolde() + compteCourant.getDecouvert()) < montant) {
				isOK = false;
			} else {
				compteBancaire.setSolde(compteBancaire.getSolde() - montant);
				dao.update(compteBancaire);
				isOK = true;
			}
		} else if (compteBancaire.getTypeCompte().equals("Epargne")) {
			if (compteBancaire.getSolde() < montant) {
				isOK = false;
			} else {
				compteBancaire.setSolde(compteBancaire.getSolde() - montant);
				dao.update(compteBancaire);
				isOK = true;
			}
		}

		return isOK;
	}

	@Override
	public boolean virement(CompteBancaire compteOrigine, CompteBancaire compteBeneficiaire, double montant) {
		if(retrait(compteOrigine, montant)) {
			versement(compteBeneficiaire, montant);
			return true;
		}
		return false;
	}

}
