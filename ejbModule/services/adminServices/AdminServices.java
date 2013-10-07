package services.adminServices;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import persistance.Admin;


/**
 * Session Bean implementation class AdminServices
 */
@Stateless
@LocalBean
public class AdminServices implements AdminServicesRemote, AdminServicesLocal {
       @PersistenceContext
       EntityManager ad;

/**
 * Session Bean implementation class AdminServices
 */
    public AdminServices() {

    }

	@Override
	public void createAdmin(Admin admin) {
		ad.persist(admin);
		
	}

	@Override
	public void updateAdmin(Admin admin) {
		ad.refresh(admin);
		
	}

	@Override
	public void deleteAdmin(Admin admin) {
		ad.remove(ad.merge(admin));
		
	}

	@Override
	public Admin findAdminById(int idAdmin) {
		
		return ad.find(Admin.class, idAdmin);
	}

	@Override
	public List<Admin> getAdmin() {
		
		return ad.createQuery("From Admin",Admin.class).getResultList();
	}
    
       


}
