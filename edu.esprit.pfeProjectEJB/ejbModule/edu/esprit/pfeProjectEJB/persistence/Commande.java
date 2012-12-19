package edu.esprit.pfeProjectEJB.persistence;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Commande implements Serializable{

	@Id
	private String numCommande;
	private Date date;
	@ManyToOne
	private User client;
	
	@OneToMany(fetch=FetchType.LAZY)
	@JoinTable(name = "CMD_ART", joinColumns = @JoinColumn(name = "CMD_ID"), inverseJoinColumns = @JoinColumn(name = "ART_ID"))
	private List<Article> articles;	public String getNumCommande() {
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
	public User getClient() {
		return client;
	}
	public void setClient(User client) {
		this.client = client;
	}
	public List<Article> getArticles() {
		return articles;
	}
	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}
	
	
}
