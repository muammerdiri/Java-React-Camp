package core.validations.emailValidation;

import java.util.Scanner;

public  class EmailValidation {
    public static boolean sendValidationMessage(String email){
        System.out.println(email+" hesabına doğrulama maili gönderildi.");
        boolean result = false;
        Scanner s = new Scanner(System.in);
        if (s.nextInt()==1) {
            result = true;
            System.out.println(email + " hesabı onaylandı.");
        }else {
            result = false;
            System.err.println(email + " hesabı onaylanamadı.");
        }
        return result;
    }




}
