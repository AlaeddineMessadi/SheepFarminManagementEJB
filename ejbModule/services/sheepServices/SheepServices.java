package services.sheepServices;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import persistance.Employee;
import persistance.Monitoring;
import persistance.Sheep;
import persistance.Vaccine;

/**
 * Session Bean implementation class SheepServices
 */
@Stateless
@LocalBean
public class SheepServices implements SheepServicesRemote, SheepServicesLocal {

	@PersistenceContext
	EntityManager sh;
    /**
     * Default constructor. 
     */
    public SheepServices() {
       
    }

	@Override
	public void createSheep(Sheep sheep) {
		sh.persist(sheep);
		
	}

	@Override
	public void updateSheep(Sheep sheep) {
		sh.merge(sheep);
		
	}

	@Override
	public void deleteSheep(Sheep sheep) {
		sh.remove(sh.merge(sheep));
		
	}

	@Override
	public Sheep findSheepById(int idSheep) {
		return sh.find(Sheep.class, idSheep);
	}

	@Override
	public List<Sheep> getSheeps() {
		return sh.createQuery("FROM Sheep",Sheep.class).getResultList() ;
	}

	@Override
	public void vaccinTosheep(Sheep sheep, List<Vaccine> vaccines) {
		for(Vaccine vaccine:vaccines){
			vaccine.setSheep(sheep);
			sh.persist(vaccine);
		}		
	}

	@Override
	public void monitoringToSheep(Sheep sheep, List<Monitoring> monitorings) {
		for(Monitoring monitoring:monitorings){
			monitoring.setSheep(sheep);
			sh.persist(monitoring);
		}	
	}

}
