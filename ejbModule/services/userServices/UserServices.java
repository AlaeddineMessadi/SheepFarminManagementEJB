package services.userServices;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

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

}
