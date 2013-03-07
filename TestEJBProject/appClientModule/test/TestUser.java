package test;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import edu.esprit.pfeProjectEJB.DAO.interfaces.ArticleDaoRemote;
import edu.esprit.pfeProjectEJB.DAO.interfaces.UserDAORemote;
import edu.esprit.pfeProjectEJB.persistence.User;

public class TestUser {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		
		//createUser(); 
		auth() ;
		
	}
public static void createUser() throws Exception {
	Context ctx = new InitialContext() ;
	UserDAORemote usr =  (UserDAORemote) ctx.lookup("/edu.esprit.pfeProject/edu.esprit.pfeProjectEJB/UserDAO!edu.esprit.pfeProjectEJB.DAO.interfaces.UserDAORemote") ;

	
	User magasinier = new User("ben foulen", "foulen", "magasinier", "magasinier") ;
	usr.createPersonne(magasinier) ;
	
}

public static void auth() throws Exception{
	Context ctx = new InitialContext() ;
	UserDAORemote usr =  (UserDAORemote) ctx.lookup("/edu.esprit.pfeProject/edu.esprit.pfeProjectEJB/UserDAO!edu.esprit.pfeProjectEJB.DAO.interfaces.UserDAORemote") ;
    usr.authentification("aaaa", "azje") ;
   
    
	
}
}
