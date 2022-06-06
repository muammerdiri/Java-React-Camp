package core.adapters.googleAuth;

import core.regex.EmailRegex;

public class GoogleAccountAdapter implements GoogleAccount {
    @Override
    public void loginWithGoogle(String email, String password) {
        googleAuth.GoogleAccount googleAccount = new googleAuth.GoogleAccount();
        if (!EmailRegex.emailCheck(email)){
            System.out.println("Google ile giriş yapılamadı.");
            return;
        }
        googleAccount.login(email, password);
        System.out.println("Google ile giriş yapıldı.");

    }
}
