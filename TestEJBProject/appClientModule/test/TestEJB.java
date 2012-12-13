package test;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import edu.esprit.pfeProjectEJB.domain.management.interfaces.ArticleDaoRemote;
import edu.esprit.pfeProjectEJB.persistence.Article;

public class TestEJB {
	public TestEJB ()  {
		
	}

	public static void main(String[] args) {
	
		   ArticleDaoRemote gest = null ;
			try {
				Context ctx = new InitialContext() ;
				Object o =(ArticleDaoRemote) ctx.lookup("ejb:/edu.esprit.pfeProjectEJB/ArticleDao!edu.esprit.pfeProjectEJB.domain.management.interfaces.ArticleDaoRemote") ;
			     gest = (ArticleDaoRemote) o ;
		
			} catch (NamingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		createArticle(gest) ; 
		  
	}

	
		
	   public static void createArticle(ArticleDaoRemote gest ) {
		   
           Article article = new Article("aaaaaa", "bbbbbb") ;
		   gest.createArticle(article) ;
	   }
	
	   
	
	
}
