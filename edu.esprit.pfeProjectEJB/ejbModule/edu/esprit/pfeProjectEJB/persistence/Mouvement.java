package edu.esprit.pfeProjectEJB.persistence;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Entity implementation class for Entity: Mouvement
 *
 */
@Entity

	public class Mouvement implements Serializable {

		   @Id
		   @GeneratedValue(strategy=GenerationType.IDENTITY)
		private int id;
		@Temporal(TemporalType.TIMESTAMP)

		private Date date;
		private float quantit�;
		
		
		
	@ManyToOne
		 private Article article ;
		public Article getArticle() {
		return article;
	}



	public void setArticle(Article article) {
		this.article = article;
	}

		private static final long serialVersionUID = 1L;

		public Mouvement() {
			super();
		}   
		
		

		public int getId() {
			return this.id;
		}

		public void setId(int id) {
			this.id = id;
		}   
		public Date getDate() {
			return this.date;
		}

		public void setDate(Date date) {
			this.date = date;
		}   
		public float getQuantit�() {
			return this.quantit�;
		}

		public void setQuantit�(float quantit�) {
			this.quantit� = quantit�;
		}



		
		
	   
	}
   

