package services.vaccineServices;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import persistance.Admin;
import persistance.Vaccine;

/**
 * Session Bean implementation class VaccineServices
 */
@Stateless
@LocalBean
public class VaccineServices implements VaccineServicesRemote, VaccineServicesLocal {
	 @PersistenceContext
     EntityManager ad;

    /**
     * Default constructor. 
     */
    public VaccineServices() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void createVaccine(Vaccine vaccin) {
		ad.persist(vaccin);

		
	}

	@Override
	public void updateAdmin(Vaccine vaccin) {
		ad.merge(vaccin);

		
	}

	@Override
	public void deleteAdmin(Vaccine vaccin) {
		ad.remove(ad.merge(vaccin));

		
	}

	@Override
	public Vaccine findAdminById(int id_vaccin) {
		// TODO Auto-generated method stub
			return ad.find(Vaccine.class, id_vaccin);

	}

	@Override
	public List<Vaccine> getVaccin() {
		// TODO Auto-generated method stub
			return ad.createQuery("From Vaccine",Vaccine.class).getResultList();

	}

}
