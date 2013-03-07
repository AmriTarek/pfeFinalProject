package edu.esprit.pfeProjectEJB.DAO.interfaces;

import java.util.List;

import javax.ejb.Local;

import edu.esprit.pfeProjectEJB.persistence.User;

@Local
public interface UserDAOLocal {
	
	public void createPersonne(User user) ;
	public void updatePersonne(User user);
	public void removePersonne(User user) ;
	public List<User> getAllUser() ;
	public User authentification(String login, String password) ;

	
	
	

}
