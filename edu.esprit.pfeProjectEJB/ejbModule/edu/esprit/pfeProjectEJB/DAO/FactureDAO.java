package edu.esprit.pfeProjectEJB.DAO;

import java.util.List;

import edu.esprit.pfeProjectEJB.DAO.interfaces.FactureDAOLocal;
import edu.esprit.pfeProjectEJB.DAO.interfaces.FactureDAORemote;
import edu.esprit.pfeProjectEJB.persistence.Facture;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class FactureDAO
 */
@Stateless
@LocalBean
public class FactureDAO implements FactureDAORemote, FactureDAOLocal {

    /**
     * Default constructor. 
     */
    public FactureDAO() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void createFacture(Facture facture) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateFacture(Facture facture) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteFacture(Facture facture) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Facture readById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Facture> getAllFacture() {
		// TODO Auto-generated method stub
		return null;
	}

}
