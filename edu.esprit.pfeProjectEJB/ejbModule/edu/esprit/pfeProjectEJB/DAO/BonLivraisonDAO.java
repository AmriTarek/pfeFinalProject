package edu.esprit.pfeProjectEJB.DAO;

import java.util.List;

import edu.esprit.pfeProjectEJB.DAO.interfaces.BonLivraisonDAOLocal;
import edu.esprit.pfeProjectEJB.DAO.interfaces.BonLivraisonDAORemote;
import edu.esprit.pfeProjectEJB.persistence.BonLivraison;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

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

	@Override
	public void createBonLivraison(BonLivraison bonlivraison) {
		em.persist(bonlivraison);
		
		
	}

	@Override
	public void updateBonLivraison(BonLivraison bonlivraison) {
		em.merge(bonlivraison);
		
	}

	@Override
	public void deleteBonLivraison(BonLivraison bonlivraison) {
em.remove(bonlivraison)		;
	}

	@Override
	public BonLivraison readById(int id) {
		return em.find(BonLivraison.class, id);
	}

	@Override
	public List<BonLivraison> getAllBonLivraison() {
		return em.createQuery("select b from bonlivraison b").getResultList();

		
		
	}

}
