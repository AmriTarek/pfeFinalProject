package edu.esprit.pfeProjectEJB.persistence;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Entity implementation class for Entity: Facture
 * 
 */
@Entity
public class Facture implements Serializable {

	private int id;
	private int num_fact;
	private Date date;
	private Fournisseur fournisseur;

	@Id
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNum_fact() {
		return num_fact;
	}

	public void setNum_fact(int num_fact) {
		this.num_fact = num_fact;
	}

	@Temporal(TemporalType.DATE)
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	private static final long serialVersionUID = 1L;

	public Facture() {
		super();
	}

	@ManyToOne
	public Fournisseur getFournisseur() {
		return fournisseur;
	}

	public void setFournisseur(Fournisseur fournisseur) {
		this.fournisseur = fournisseur;
	}

}
