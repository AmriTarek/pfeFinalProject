package edu.esprit.pfeProjectEJB.persistence;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Commande implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private String numCommande;

	@Temporal(TemporalType.TIMESTAMP)
	private Date date;

	@ManyToOne
	private User user;

	@OneToMany(mappedBy = "commande")
	private List<Article> articles;

	public String getNumCommande() {
		return numCommande;
	}

	public void setNumCommande(String numCommande) {
		this.numCommande = numCommande;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public List<Article> getArticles() {
		return articles;
	}

	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
