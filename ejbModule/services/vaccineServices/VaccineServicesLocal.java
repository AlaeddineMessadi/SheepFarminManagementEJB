package services.vaccineServices;

import java.util.List;

import javax.ejb.Local;


import persistance.Vaccine;

@Local
public interface VaccineServicesLocal {
	public void createVaccine(Vaccine vaccin);
    public void updateAdmin(Vaccine vaccin);
    public void deleteAdmin(Vaccine vaccin);
    public Vaccine findAdminById(int id_vaccin);
    public List<Vaccine> getVaccin();

}
