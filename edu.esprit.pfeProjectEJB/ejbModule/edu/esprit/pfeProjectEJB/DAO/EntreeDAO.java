package edu.esprit.pfeProjectEJB.DAO;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import edu.esprit.pfeProjectEJB.DAO.interfaces.EntreeDAOLocal;
import edu.esprit.pfeProjectEJB.DAO.interfaces.EntreeDAORemote;
import edu.esprit.pfeProjectEJB.persistence.Entree;

@Stateless
@LocalBean
public class EntreeDAO implements EntreeDAORemote, EntreeDAOLocal {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public List calculerEntree() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addEntree(Entree entree) {
		entityManager.persist(entree);

	}

}
