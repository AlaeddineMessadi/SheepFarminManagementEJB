package services.sheepServices;

import java.util.List;

import javax.ejb.Remote;

import persistance.Batiment;
import persistance.Employee;
import persistance.Monitoring;
import persistance.Sheep;
import persistance.Vaccine;

@Remote
public interface SheepServicesRemote {

    public void createSheep(Sheep sheep);
    public void updateSheep(Sheep sheep);
    public void deleteSheep(Sheep sheep);
    public Sheep findSheepById(int idSheep);
    public List<Sheep> getSheeps();
	public void vaccinTosheep(Sheep sheep, List<Vaccine> vaccines);
	public void monitoringToSheep(Sheep sheep, List<Monitoring> monitorings);

}
