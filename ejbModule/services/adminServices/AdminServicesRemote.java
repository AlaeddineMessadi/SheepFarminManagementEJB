package services.adminServices;

import java.util.List;

import javax.ejb.Remote;

import persistance.Admin;

@Remote
public interface AdminServicesRemote {
    public void createAdmin(Admin admin);
    public void updateAdmin(Admin admin);
    public void deleteAdmin(Admin admin);
    public Admin findAdminById(int idAdmin);
    public List<Admin> getAdmin();
}
