package business.abstracts;

import entities.concretes.User;

import java.awt.*;
import java.util.ArrayList;

public interface UserService {
    void add(User user);
    ArrayList<User> getAll();
    void findAll();
}
