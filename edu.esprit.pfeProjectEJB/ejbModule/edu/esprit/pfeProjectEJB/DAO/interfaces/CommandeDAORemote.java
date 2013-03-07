package edu.esprit.pfeProjectEJB.DAO.interfaces;

import java.util.List;

import javax.ejb.Remote;

import edu.esprit.pfeProjectEJB.persistence.Commande;

@Remote
public interface CommandeDAORemote {
	
	public void createCommande(Commande commande) ;
	public void updateCommande(Commande commande) ;
	public void deleteCommande(Commande commande) ;
	public Commande readById(int numCommande) ;
	public List<Commande> getAllCommande() ;

}
