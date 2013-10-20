package services.vaccineServices;

import java.util.List;

import javax.ejb.Remote;

import persistance.Vaccine;

@Remote
public interface VaccineServicesRemote {
	 public void createVaccine(Vaccine vaccin);
	    public void updateAdmin(Vaccine vaccin);
	    public void deleteAdmin(Vaccine vaccin);
	    public Vaccine findAdminById(int id_vaccin);
	    public List<Vaccine> getVaccin();

}
