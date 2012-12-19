package edu.esprit.pfeProjectEJB.persistence;



import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Personne implements Serializable{
	
	public int ncin;
	public String nom;
	
	
	@Id
	public int getNcin() {
		return ncin;
	}
	
	public void setNcin(int ncin) {
		this.ncin = ncin;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	

}
