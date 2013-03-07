package edu.esprit.pfeProjectEJB.DAO.interfaces;

import java.util.List;

import javax.ejb.Remote;

import edu.esprit.pfeProjectEJB.persistence.User;

@Remote
public interface UserDAORemote {
	public void createPersonne(User user) ;
	public void updatePersonne(User user);
	public void removePersonne(User user) ;
	public List<User> getAllUser() ;
	public User authentification(String login, String password) ;
	
	

}
