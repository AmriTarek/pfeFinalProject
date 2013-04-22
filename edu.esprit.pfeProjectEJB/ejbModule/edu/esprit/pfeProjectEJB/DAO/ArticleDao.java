package edu.esprit.pfeProjectEJB.DAO;

import java.util.Date;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import edu.esprit.pfeProjectEJB.DAO.interfaces.ArticleDaoLocal;
import edu.esprit.pfeProjectEJB.DAO.interfaces.ArticleDaoRemote;
import edu.esprit.pfeProjectEJB.persistence.Article;
import edu.esprit.pfeProjectEJB.persistence.Entree;
import edu.esprit.pfeProjectEJB.persistence.Mouvement;
import edu.esprit.pfeProjectEJB.persistence.Sortie;

/**
 * Session Bean implementation class ArticleDao
 */
@Stateless
@LocalBean
public class ArticleDao implements ArticleDaoRemote, ArticleDaoLocal {

	@PersistenceContext(unitName = "edu.esprit.pfeProjectEJB")
	EntityManager em;

	public ArticleDao() {
		// TODO Auto-generated constructor stub
	}

	public void createArticle(Article article) {
		// em.find(Article.class, article.getCode_Art()) ;
		em.persist(article);
		Entree entree = new Entree();
		
	//entree.set(article.getCode_Art()) ;
		entree.setDate(new Date());
	    entree.setQuantit�(article.getQuantit�());
		em.persist(entree);
	}

	public void updateArticle(Article article) {
		em.merge(article);


		

	}

	public void deleteArticle(Article article) {
		em.remove(em.merge(article));

	}

	@SuppressWarnings("unchecked")
	public List<Article> getAllArticle() {
		Query query = em.createQuery("select a from Article a");
		return query.getResultList();
	}

	@Override
	public Article readById(int codeArt) {
		return em.find(Article.class, codeArt);

	}

	/*@Override
	public void updateQuanArticle(int code_Art, int quantit�) {
	Article article = 	em.find(Article.class, code_Art) ;
	Query query = em.createQuery("select m from Mouvement m where  DTYPE='Entree'") ;
	query.getResultList() ;
	if (article.getQuantit�() < quantit� )
	entree.setQuantit�(quantit�) ; 
	else 
		sortie.setQuantit�(quantit�) ;
	em.merge(entree) ;
	em.merge(sortie) ;
	em.merge(article) ;
	
		
		


      
			
			
		
		// TODO Auto-generated method stub
		
	}
*/

		public void entregisterEntree(int id_art, int quant) {
			
			Article article = em.find(Article.class, id_art) ;
			//em.merge(article) ;
			//article.setQuantit�(article.getQuantit�())  ;
			//em.merge(article);
			if (quant > article.getQuantit�()) {
			Entree entree = new Entree() ;
			entree.setQuantit�(quant - article.getQuantit�()) ;
			
			entree.setArticle(article) ;
			em.persist(entree) ;
			}
			
			else {
				
			
				Sortie sortie = new Sortie() ;
			sortie.setQuantit�(article.getQuantit�() - quant) ;
			sortie.setArticle(article);
			em.persist(sortie) ; }
			
			
		}
		
			
			
		
	
	

}
