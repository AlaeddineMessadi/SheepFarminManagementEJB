package services.userServices;

import java.util.List;

import javax.ejb.Remote;

import persistance.User;

@Remote
public interface UserServicesRemote {
    public void createUser(User user);
    public void updateUser(User user);
    public void deleteUser(User user);
    public User findUserById(int idUser);
    public List<User> getUsers();
}
