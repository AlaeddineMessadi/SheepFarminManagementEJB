package services.farmServices;

import java.util.List;

import javax.ejb.Remote;

import persistance.Farm;

@Remote
public interface FarmServicesRemote {
    public void createFarm(Farm farm);
    public void updateFarm(Farm farm);
    public void deleteFarm(Farm farm);
    public Farm findFarmById(int idFarm);
    public List<Farm> getFarms();
}
