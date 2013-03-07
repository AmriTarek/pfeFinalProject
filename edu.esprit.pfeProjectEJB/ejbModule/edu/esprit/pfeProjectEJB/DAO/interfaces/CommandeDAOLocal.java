package edu.esprit.pfeProjectEJB.DAO.interfaces;

import java.util.List;

import javax.ejb.Local;


import edu.esprit.pfeProjectEJB.persistence.Commande;

@Local
public interface CommandeDAOLocal {
	public void createCommande(Commande commande) ;
	public void updateCommande(Commande commande) ;
	public void deleteCommande(Commande commande) ;
	public Commande readById(int numCommande) ;
	public List<Commande> getAllCommande() ;


}
