package services.batimentServices;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import persistance.Batiment;

/**
 * Session Bean implementation class BatimentServices
 */
@Stateless
@LocalBean
public class BatimentServices implements BatimentServicesRemote, BatimentServicesLocal {

	@PersistenceContext
	 EntityManager bat;
    /**
     * Default constructor. 
     */
    public BatimentServices() {
       
    }

	@Override
	public void createBatiment(Batiment batiment) {

		bat.persist(batiment);
	}

	@Override
	public void updateBatiment(Batiment batiment) {
		bat.merge(batiment);
		
	}

	@Override
	public void deleteBatiment(Batiment batiment) {
		bat.remove(bat.merge(batiment));
		
	}

	@Override
	public Batiment findBatimentById(int idBatiment) {

		return bat.find(Batiment.class, idBatiment);
	}

	@Override
	public List<Batiment> getBatiment() {
		return bat.createQuery("FROM Batiment",Batiment.class).getResultList();
	}

}
