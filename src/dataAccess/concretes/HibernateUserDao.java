package dataAccess.concretes;

import core.validations.emailValidation.EmailValidation;
import dataAccess.abstracts.UserDao;
import entities.concretes.User;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class HibernateUserDao implements UserDao {
    ArrayList<User> list = new ArrayList<>();


    @Override
    public void add(User user) {
        if (!checkedByEmail(user.getEmail())){
            System.out.println("Bu email kullanılıyor, başka bir email giriniz");
            return;
        }

        if(!EmailValidation.sendValidationMessage(user.getEmail())){
            System.out.println(user.getEmail()+ " doğrulama yapılamadığı için eklenemedi");
            return;
        }
        list.add(user);
        System.out.println("Hibernate ile eklendi: "+user.getFirstName()+" "+user.getLastName());
    }

    @Override
    public void delete(User user) {
        list.remove(user);
        System.out.println("Hibernate ile silindi: "+user.getFirstName()+" "+user.getLastName());
    }

    @Override
    public void update(User user) {
        System.out.println("Hibernate ile güncellendi: "+user.getFirstName()+" "+user.getLastName());
    }

    @Override
    public User get(int id) {
        return list.get(id);
    }

    @Override
    public ArrayList<User> getAll() {
        return list;
    }

    @Override
    public void findAll() {
        for (User user:list){
            System.out.println(user);
        }
    }


    //---------------------------------------------------------

    public boolean checkedByEmail(String email){
        boolean value = true;
        for(User user:list){
            if (user.getEmail().equals(email)){
                value= false;
                break;
            }
        }
        return value;
    }
}
