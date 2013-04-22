package edu.esprit.pfeProjectEJB.persistence;

import java.io.Serializable;

import javax.persistence.Entity;

/**
 * Entity implementation class for Entity: Sortie
 * 
 */
@Entity
public class Sortie extends Mouvement implements Serializable {

	private static final long serialVersionUID = 1L;

	public Sortie() {
		super();
	}

}
