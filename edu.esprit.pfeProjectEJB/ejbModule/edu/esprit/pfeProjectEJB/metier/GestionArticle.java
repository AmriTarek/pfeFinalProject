package edu.esprit.pfeProjectEJB.metier;

import java.util.List;

import edu.esprit.pfeProjectEJB.DAO.interfaces.ArticleDaoLocal;
import edu.esprit.pfeProjectEJB.metier.interfaces.GestionArticleLocal;
import edu.esprit.pfeProjectEJB.metier.interfaces.GestionArticleRemote;
import edu.esprit.pfeProjectEJB.persistence.Article;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class GestionArticle
 */
@Stateless
@LocalBean
public class GestionArticle implements GestionArticleRemote, GestionArticleLocal {

    /**
     * Default constructor. 
     */
	@EJB
	ArticleDaoLocal instance ;
    public GestionArticle() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void creer(Article obj) {
		instance.createArticle(obj) ;
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modifier(Article obj) {
		instance.updateArticle(obj) ;
		// TODO Auto-generated method stub
		
	}

	@Override
	public void supprimer(Article obj) {
		instance.deleteArticle(obj);
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Article> findAll() {
		instance.getAllArticle() ;
		// TODO Auto-generated method stub
		return null;
	}

}
