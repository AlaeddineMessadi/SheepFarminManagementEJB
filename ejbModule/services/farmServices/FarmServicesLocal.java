package services.farmServices;

import java.util.List;

import javax.ejb.Local;
import persistance.Farm;

@Local
public interface FarmServicesLocal {
    public void createFarm(Farm farm);
    public void updateFarm(Farm farm);
    public void deleteFarm(Farm farm);
    public Farm findFarmById(int idFarm);
    public List<Farm> getFarms();
}
