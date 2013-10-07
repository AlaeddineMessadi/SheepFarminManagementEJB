package services.userServices;

import java.util.List;

import javax.ejb.Local;

import persistance.User;

@Local
public interface UserServicesLocal {
    public void createUser(User user);
    public void updateUser(User user);
    public void deleteUser(User user);
    public User findUserById(int idUser);
    public List<User> getUsers();
}
