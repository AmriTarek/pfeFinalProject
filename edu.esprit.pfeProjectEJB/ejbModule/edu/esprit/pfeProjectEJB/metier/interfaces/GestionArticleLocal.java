package edu.esprit.pfeProjectEJB.metier.interfaces;

import java.util.List;

import javax.ejb.Local;

import edu.esprit.pfeProjectEJB.persistence.Article;

@Local
public interface GestionArticleLocal {
	
	public void creer(Article obj) ;
	public void modifier(Article obj) ;
	public void supprimer (Article obj) ;
	List<Article> findAll() ; 

}
