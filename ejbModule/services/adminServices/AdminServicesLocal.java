package services.adminServices;

import java.util.List;

import javax.ejb.Local;

import persistance.Admin;

@Local
public interface AdminServicesLocal {

    public void createAdmin(Admin admin);
    public void updateAdmin(Admin admin);
    public void deleteAdmin(Admin admin);
    public Admin findAdminById(int idAdmin);
    public List<Admin> getAdmin();
}
