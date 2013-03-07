package edu.esprit.pfeProjectEJB.metier.interfaces;

import java.util.List;

import javax.ejb.Remote;

import edu.esprit.pfeProjectEJB.persistence.Article;

@Remote
public interface GestionArticleRemote {

	public void creer(Article obj) ;
	public void modifier(Article obj) ;
	public void supprimer (Article obj) ;
	List<Article> findAll() ; 

}
