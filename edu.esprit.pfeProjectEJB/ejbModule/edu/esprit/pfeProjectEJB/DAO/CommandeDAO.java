package edu.esprit.pfeProjectEJB.DAO;

import java.util.List;

import edu.esprit.pfeProjectEJB.DAO.interfaces.CommandeDAOLocal;
import edu.esprit.pfeProjectEJB.DAO.interfaces.CommandeDAORemote;
import edu.esprit.pfeProjectEJB.persistence.Commande;


import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Session Bean implementation class CommandeDAO
 */
@Stateless
@LocalBean
public class CommandeDAO implements CommandeDAORemote, CommandeDAOLocal {
	
	    public CommandeDAO() {
    }
	    
	    @PersistenceContext(unitName="edu.esprit.pfeProjectEJB")
	    EntityManager em ; 

		@Override
		public void createCommande(Commande commande) {
			
			em.persist(commande) ;

			
		}

		@Override
		public void updateCommande(Commande commande) {
			em.merge(commande) ;
			
		}

		@Override
		public void deleteCommande(Commande commande) {
          em.remove(commande)	;		
		}

		@Override
		public Commande readById(int numCommande) {
			return em.find(Commande.class, numCommande) ; 

		}

		@SuppressWarnings("unchecked")
		@Override
		public List<Commande> getAllCommande() {
			// TODO Auto-generated method stub
			return em.createQuery("select c from Commande c").getResultList();

		}

}
