package business.concretes;

import business.abstracts.UserService;
import core.adapters.googleAuth.GoogleAccount;
import core.regex.EmailRegex;
import dataAccess.abstracts.UserDao;
import entities.concretes.User;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserManager implements UserService {
    private UserDao userDao;
    private GoogleAccount googleAccount;

    public UserManager(UserDao userDao,GoogleAccount googleAccount) {
        this.userDao = userDao;
        this.googleAccount = googleAccount;
    }

    @Override
    public void add(User user) {

        if(!(EmailRegex.emailCheck(user.getEmail()) && user.getFirstName().length() >=2 && user.getLastName().length() >= 2)) {
            System.out.println("Ad-Soyad Min. 2 karakter & email düzgün formatta olmalı.");
            return;
        }
        userDao.add(user);
    }

    @Override
    public ArrayList<User> getAll() {
        return userDao.getAll();
    }

    @Override
    public void findAll() {

    }
}
