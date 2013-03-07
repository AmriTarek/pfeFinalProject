package edu.esprit.pfeProjectEJB.DAO;

import java.util.List;

import edu.esprit.pfeProjectEJB.DAO.interfaces.FournisseurDAOLocal;
import edu.esprit.pfeProjectEJB.DAO.interfaces.FournisseurDAORemote;
import edu.esprit.pfeProjectEJB.persistence.Fournisseur;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Session Bean implementation class FournisseurDAO
 */
@Stateless
@LocalBean
public class FournisseurDAO implements FournisseurDAORemote, FournisseurDAOLocal {
	
	@PersistenceContext(unitName="edu.esprit.pfeProjectEJB")
	EntityManager em ;

    public FournisseurDAO() {
    }

	@Override
	public void createFournisseur(Fournisseur fournisseur) {
    em.persist(fournisseur)		;
	}

	@Override
	public void updateFournisseur(Fournisseur fournisseur) {
		
		em.merge(fournisseur) ;
		
	}

	@Override
	public void deleteFournisseur(Fournisseur fournisseur) {
		em.remove(fournisseur) ;
		
	}

	public Fournisseur readById(int id) {
		
		return em.find(Fournisseur.class, id) ; 
	}

	@Override
	public List<Fournisseur> getAllFournisseurs() {
		return em.createQuery("select f from fournisseurs f").getResultList();
	}

	

    
    
    
    
    
    
    
    
}
