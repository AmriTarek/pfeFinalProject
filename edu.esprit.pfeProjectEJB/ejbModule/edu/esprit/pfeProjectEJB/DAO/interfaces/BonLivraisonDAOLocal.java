package edu.esprit.pfeProjectEJB.DAO.interfaces;

import java.util.List;

import javax.ejb.Local;

import edu.esprit.pfeProjectEJB.persistence.BonLivraison;

@Local
public interface BonLivraisonDAOLocal {
	
	public void createBonLivraison(BonLivraison bonlivraison) ;
	public void updateBonLivraison(BonLivraison bonlivraison) ;
	public void deleteBonLivraison(BonLivraison bonlivraison) ;
	public BonLivraison readById(int id) ;
	public List<BonLivraison> getAllBonLivraison() ;

}
