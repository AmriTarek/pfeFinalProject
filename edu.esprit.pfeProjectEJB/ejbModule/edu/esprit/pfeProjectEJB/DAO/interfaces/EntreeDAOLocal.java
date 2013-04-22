package edu.esprit.pfeProjectEJB.DAO.interfaces;

import java.util.List;

import javax.ejb.Local;
import javax.persistence.Query;


@Local
public interface EntreeDAOLocal {
	public List calculerEntree() ;

}
