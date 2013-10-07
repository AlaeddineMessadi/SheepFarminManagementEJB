package services.batimentServices;

import java.util.List;

import javax.ejb.Remote;

import persistance.Batiment;

@Remote
public interface BatimentServicesRemote {
    public void createBatiment(Batiment batiment);
    public void updateBatiment(Batiment batiment);
    public void deleteBatiment(Batiment batiment);
    public Batiment findBatimentById(int idBatiment);
    public List<Batiment> getBatiment();
}
