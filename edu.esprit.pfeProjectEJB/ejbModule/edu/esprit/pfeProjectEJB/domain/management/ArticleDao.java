package edu.esprit.pfeProjectEJB.domain.management;

import java.util.List;

import edu.esprit.pfeProjectEJB.domain.management.interfaces.ArticleDaoLocal;
import edu.esprit.pfeProjectEJB.domain.management.interfaces.ArticleDaoRemote;
import edu.esprit.pfeProjectEJB.persistence.Article;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 * Session Bean implementation class ArticleDao
 */
@Stateless
@LocalBean
public class ArticleDao implements ArticleDaoRemote, ArticleDaoLocal {

	@PersistenceContext
	EntityManager em ;
    public ArticleDao() {
        // TODO Auto-generated constructor stub
    }


	public void createArticle(Article article) {
		em.persist(article) ;
		
	}

	
	public void updateArticle(Article article) {
		em.merge(article) ;
		
	}

	
	public void deleteArticle(Article article) {
		em.remove(article) ;
		
	}

	
	public Article getArticleById(int codeArt) {
		Article article = em.find(Article.class, codeArt) ;
		return null;
	}

	
	public List<Article> getAllArticle() {
		Query query = em.createQuery("select a from Article a") ;
		return query.getResultList() ;
	}

}
