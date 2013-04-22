package edu.esprit.pfeProjectEJB.DAO.interfaces;

import java.util.List;

import javax.ejb.Remote;

import edu.esprit.pfeProjectEJB.persistence.Entree;

@Remote
public interface EntreeDAORemote {
	public List calculerEntree();

	void addEntree(Entree entree);

}
