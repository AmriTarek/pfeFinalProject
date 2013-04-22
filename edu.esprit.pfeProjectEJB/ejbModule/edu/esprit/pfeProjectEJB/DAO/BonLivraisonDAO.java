package edu.esprit.pfeProjectEJB.DAO;

import java.util.List;

import edu.esprit.pfeProjectEJB.DAO.interfaces.BonLivraisonDAOLocal;
import edu.esprit.pfeProjectEJB.DAO.interfaces.BonLivraisonDAORemote;
import edu.esprit.pfeProjectEJB.persistence.BonLivraison;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 * Session Bean implementation class BonLivraisonDAO
 */
@Stateless
@LocalBean
public class BonLivraisonDAO implements BonLivraisonDAORemote, BonLivraisonDAOLocal {
	
	@PersistenceContext(unitName="edu.esprit.pfeProjectEJB")
	EntityManager em ;

    /**
     * Default constructor. 
     */
    public BonLivraisonDAO() {
        // TODO Auto-generated constructor stub
    }

	
	public void createBonLivraison(BonLivraison bonlivraison) {
		em.persist(bonlivraison);
		
		
	}

	
	public void updateBonLivraison(BonLivraison bonlivraison) {
		em.merge(bonlivraison);
		
	}

	
	public void deleteBonLivraison(BonLivraison bonlivraison) {
em.remove(bonlivraison)		;
	}

	
	public BonLivraison readById(int id) {
		return em.find(BonLivraison.class, id);
	}

	@SuppressWarnings("unchecked")
	
	public List<BonLivraison> getAllBonLivraison() {
		Query query = em.createQuery("select b from BonLivraison b") ;
		return query.getResultList() ;
		
		
	}

}
