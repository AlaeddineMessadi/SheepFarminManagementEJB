package services.batimentServices;

import java.util.List;

import javax.ejb.Local;

import persistance.Batiment;
import persistance.Employee;
import persistance.Sheep;

@Local

public interface BatimentServicesLocal {

	    public void createBatiment(Batiment batiment);
	    public void updateBatiment(Batiment batiment);
	    public void deleteBatiment(Batiment batiment);
	    public Batiment findBatimentById(int idBatiment);
	    public List<Batiment> getBatiment();
	    void EmployeeToBatiment(Batiment batiment,List<Employee> employees);
	    void SheepToBatiment(Batiment batiment,List<Sheep> sheeps);
}