package services.sheepServices;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import persistance.Sheep;

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
		sh.refresh(sheep);
		
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

}
