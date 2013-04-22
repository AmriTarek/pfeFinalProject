package edu.esprit.pfeProjectEJB.DAO;

import java.util.List;

import edu.esprit.pfeProjectEJB.DAO.interfaces.MouvementDAOLocal;
import edu.esprit.pfeProjectEJB.DAO.interfaces.MouvementDAORemote;
import edu.esprit.pfeProjectEJB.persistence.Mouvement;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 * Session Bean implementation class MouvementDAO
 */
@Stateless
@LocalBean
public class MouvementDAO implements MouvementDAORemote, MouvementDAOLocal {
	@PersistenceContext(unitName = "edu.esprit.pfeProjectEJB")
	EntityManager em;

    /**
     * Default constructor. 
     */
    public MouvementDAO() {
        // TODO Auto-generated constructor stub
    }

	/*@Override
	public List<Mouvement> calcluerEntree() {
		Query query = em.createQuery("SELECT SUM(Quantité) FROM pfe.mouvement m WHERE DTYPE='Entree' GROUP BY article_code_Art;") ;
		return query.getResultList() ;
		
	}

	@Override
	public List<Mouvement> calculerSortie() {
		// TODO Auto-generated method stub
		return null;
	}*/

}
