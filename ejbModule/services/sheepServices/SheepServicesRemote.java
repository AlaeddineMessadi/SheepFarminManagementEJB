package services.sheepServices;

import java.util.List;

import javax.ejb.Remote;

import persistance.Sheep;

@Remote
public interface SheepServicesRemote {

    public void createSheep(Sheep sheep);
    public void updateSheep(Sheep sheep);
    public void deleteSheep(Sheep sheep);
    public Sheep findSheepById(int idSheep);
    public List<Sheep> getSheeps();
}
