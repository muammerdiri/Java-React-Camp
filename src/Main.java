import business.concretes.UserManager;
import core.adapters.googleAuth.GoogleAccountAdapter;
import dataAccess.concretes.HibernateUserDao;
import entities.concretes.User;

public class Main {
    public static void main(String[] args) {
        var user = new User(1,"Muammer","Diri","muammerdirigmail.com","1q2w3e4r");
        var user2 = new User(2,"Ahmet","Diri","ahmetdiri@gmail.com","1q2w3e4r");
        var manager = new UserManager(new HibernateUserDao(),new GoogleAccountAdapter());
        manager.add(user);
        manager.add(user2);

        GoogleAccountAdapter googleAccountAdapter = new GoogleAccountAdapter();
        googleAccountAdapter.loginWithGoogle(user.getEmail(), user.getPassword());




    }
}
