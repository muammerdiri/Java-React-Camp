package dataAccess.abstracts;

import entities.concretes.User;

import java.util.ArrayList;

public interface UserDao {
    void add(User user);
    void delete(User user);
    void update(User user);
    User get(int id);
    ArrayList<User> getAll();
    void findAll();
}
