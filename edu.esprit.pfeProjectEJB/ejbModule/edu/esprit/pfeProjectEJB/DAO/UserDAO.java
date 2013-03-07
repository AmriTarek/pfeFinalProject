package edu.esprit.pfeProjectEJB.DAO;

import java.util.List;

import edu.esprit.pfeProjectEJB.DAO.interfaces.UserDAOLocal;
import edu.esprit.pfeProjectEJB.DAO.interfaces.UserDAORemote;
import edu.esprit.pfeProjectEJB.persistence.User;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.validation.ValidationException;

/**
 * Session Bean implementation class UserDAO
 */
@Stateless
@LocalBean
public class UserDAO implements UserDAORemote, UserDAOLocal {
	
	
	@PersistenceContext(unitName="edu.esprit.pfeProjectEJB")
	EntityManager em ;

    /**
     * Default constructor. 
     */
    public UserDAO() {
       
    }

	@Override
	public void createPersonne(User user) {
		em.persist(user) ;
		
	}

	@Override
	public void updatePersonne(User user) {
em.merge(user)		;
	}

	@Override
	public void removePersonne(User user) {
em.remove(user)		;
	}

	@Override
	public List<User> getAllUser() {
		return em.createQuery("select u from user u").getResultList();
	
	}

	@Override
	public User authentification(String login, String password) {
		 if (login == null || "".equals(login))
		throw new ValidationException("Invalid login");
		 
		 Query query ;
		 User user ;
		 query=em.createQuery("SELECT u from USER u WHERE u.login=:login ") ;
		 query.setParameter("login", login) ;
		 user=(User) query.getSingleResult() ;
		 if (user!=null)
			 user.verifierPassword(password) ;
		 return user ;
		
	}

	
		
				
		// TODO Auto-generated method stub
		
	}


