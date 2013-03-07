package test;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import edu.esprit.pfeProjectEJB.DAO.interfaces.ArticleDaoRemote;
import edu.esprit.pfeProjectEJB.DAO.interfaces.FournisseurDAORemote;
import edu.esprit.pfeProjectEJB.persistence.Article;
import edu.esprit.pfeProjectEJB.persistence.Fournisseur;


public class TestEJB {
	public static void main(String[] args) throws Exception {
		 

	//createFrns() ;
	 
	//readFrn() ;
	updateFrns() ;
	
//listerArticle();
	
	}
	
	public static void listerArticle() throws Exception {
		
		Context ctx = new InitialContext() ;
		ArticleDaoRemote arti = (ArticleDaoRemote) ctx.lookup("/edu.esprit.pfeProject/edu.esprit.pfeProjectEJB/ArticleDao!edu.esprit.pfeProjectEJB.DAO.interfaces.ArticleDaoRemote") ;
		List<Article> art = new ArrayList<Article>() ;
		art = arti.getAllArticle() ;
		
		System.out.println(art.get(3)) ;
		
	}

	public static void createFrns() throws NamingException {
		
		 Context ctx = new InitialContext() ;
		 FournisseurDAORemote frs = (FournisseurDAORemote) ctx.lookup("/edu.esprit.pfeProject/edu.esprit.pfeProjectEJB/FournisseurDAO!edu.esprit.pfeProjectEJB.DAO.interfaces.FournisseurDAORemote") ;
		// Fournisseur fournisseur = new Fournisseur("tarek", "tunis", "tunisie", "aaaa@hahah.fr" ) ; 
		 //Fournisseur fournisseur2 = new Fournisseur("mohamed","ariena","tunisie","jshdjsf@jhdjq.fr") ;
		// Fournisseur fournisseur3 = new Fournisseur("ali","ben arous","tunisie","jpoijsf@rtejq.fr") ;
		
		 Fournisseur fournisseur4 = new Fournisseur("salah","beja","tunisie","jpeaesf@rterrr.fr") ;

		 //frs.createFournisseur(fournisseur) ;
		// frs.createFournisseur(fournisseur2) ;
		// frs.createFournisseur(fournisseur3) ; 
			frs.createFournisseur(fournisseur4) ; 

		 
		 
	}
	
	public static void createArt() throws NamingException {
		 Context ctx2 = new InitialContext() ;
		 ArticleDaoRemote art = (ArticleDaoRemote) ctx2.lookup("/edu.esprit.pfeProject/edu.esprit.pfeProjectEJB/ArticleDao!edu.esprit.pfeProjectEJB.DAO.interfaces.ArticleDaoRemote") ;
		
		 Article article1 = new Article("a01", "Chaise", "Chaise en cuir", 100, 18, 20, 5) ;
		 Article article2 = new Article("a02", "Tableau", "Tableau magnétique", 80, 18, 50, 10) ;
		 Article article3 = new Article("a03", "Imprimante", "Laser", 120, 18, 40, 6) ;


	     art.createArticle(article1) ;
	     art.createArticle(article2) ;

	     art.createArticle(article3) ;

	}
	
	public static void readFrn() throws Exception  {
		Context ctx = new InitialContext() ;
		 FournisseurDAORemote frs = (FournisseurDAORemote) ctx.lookup("/edu.esprit.pfeProject/edu.esprit.pfeProjectEJB/FournisseurDAO!edu.esprit.pfeProjectEJB.DAO.interfaces.FournisseurDAORemote") ;
		 Fournisseur fournisseur= frs.readById(1);
		 System.out.println(fournisseur.getEmail()); 
	}
	
	public static void updateFrns() throws Exception  {
		Context ctx = new InitialContext() ;
		 FournisseurDAORemote frs = (FournisseurDAORemote) ctx.lookup("/edu.esprit.pfeProject/edu.esprit.pfeProjectEJB/FournisseurDAO!edu.esprit.pfeProjectEJB.DAO.interfaces.FournisseurDAORemote") ;
	Fournisseur fournisseur = new Fournisseur("aaaa", "dddd", "mozembique", "esdsds@qsdqskd.fr") ;
	fournisseur.setId(3) ;
	frs.updateFournisseur(fournisseur) ; }
	
	
	public TestEJB() {
		super();
	}

}