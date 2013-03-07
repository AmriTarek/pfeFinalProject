package edu.esprit.pfeProjectEJB.DAO.interfaces;

import java.util.List;

import javax.ejb.Remote;

import edu.esprit.pfeProjectEJB.persistence.BonLivraison;

@Remote
public interface BonLivraisonDAORemote {
	
	public void createBonLivraison(BonLivraison bonlivraison) ;
	public void updateBonLivraison(BonLivraison bonlivraison) ;
	public void deleteBonLivraison(BonLivraison bonlivraison) ;
	public BonLivraison readById(int id) ;
	public List<BonLivraison> getAllBonLivraison() ;

}
