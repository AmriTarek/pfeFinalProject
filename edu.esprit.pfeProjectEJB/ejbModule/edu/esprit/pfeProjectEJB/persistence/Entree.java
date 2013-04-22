package edu.esprit.pfeProjectEJB.persistence;

import java.io.Serializable;

import javax.persistence.Entity;

/**
 * Entity implementation class for Entity: Entree
 * 
 */
@Entity
public class Entree extends Mouvement implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Entree() {
		super();
	}

}
