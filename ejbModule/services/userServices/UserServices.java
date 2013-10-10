package services.userServices;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import persistance.User;

/**
 * Session Bean implementation class UserServices
 */
@Stateless
@LocalBean
public class UserServices implements UserServicesRemote, UserServicesLocal {

	@PersistenceContext
	EntityManager u ;
    /**
     * Default constructor. 
     */
    public UserServices() {
       
    }

	@Override
	public void createUser(User user) {
		 u.persist(user);
		
	}

	@Override
	public void updateUser(User user) {
		u.merge(user);
		
	}

	@Override
	public void deleteUser(User user) {
		u.remove(u.merge(user));
		
	}

	@Override
	public User findUserById(int idUser) {

		return u.find(User.class, idUser);
	}

	@Override
	public List<User> getUsers() {
		return u.createQuery("From User",User.class).getResultList();
	}
	public User authenticate(String login, String password) {
		User found = null;
		String jpql = "select u from user u where u.login=:p1 and u.pwd=:p2";
		Query query = u.createQuery(jpql);
		query.setParameter("p1", login);
		query.setParameter("p2", password);
		try{
			found = (User) query.getSingleResult();
		}catch(Exception e){
		}
		return found;
	}
}
