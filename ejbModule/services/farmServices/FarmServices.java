package services.farmServices;

import java.util.List;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import persistance.Batiment;
import persistance.Farm;

/**
 * Session Bean implementation class FarmServices
 */
@Stateless
@LocalBean
public class FarmServices implements FarmServicesRemote, FarmServicesLocal {
	@PersistenceContext
	   EntityManager em ;

	@Override
	public void createFarm(Farm farm) {
		em.persist(farm);
		
	}

	@Override
	public void updateFarm(Farm farm) {
		em.merge(farm);
		
	}

	@Override
	public void deleteFarm(Farm farm) {
		em.remove(em.merge(farm));
		
	}

	@Override
	public Farm findFarmById(int idFarm) {
		return em.find(Farm.class, idFarm);
	}

	@Override
	public List<Farm> getFarms() {
	    return em.createQuery("FROM Farm",Farm.class).getResultList() ;
	}

	@Override
	public void createFarm(Farm farm, List<Batiment> batiments) {
		
		for(Batiment batiment:batiments){
			batiment.setFarm(farm);
			em.persist(batiment);
		}
	}

	
}
