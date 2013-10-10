package services.batimentServices;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import persistance.Batiment;
import persistance.Employee;
import persistance.Farm;
import persistance.Sheep;

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
	
	
	/* 
	 * 
	 * 	public void createFarm(Farm farm, List<Batiment> batiments) {
		
		for(Batiment batiment:batiments){
			batiment.setFarm(farm);
			em.persist(batiment);
		}
	 * */
	
	
	@Override
	public void EmployeeToBatiment(Batiment batiment, List<Employee> employees) {
		
		for(Employee employee:employees){
			employee.setBatiment(batiment);
			bat.persist(employee);
		}
	}

	@Override
	public void SheepToBatiment(Batiment batiment, List<Sheep> sheeps) {
		for(Sheep sheep:sheeps){
			sheep.setBatiment(batiment);
			bat.persist(sheep);
		}
		
	}
}
