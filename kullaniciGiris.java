package patika;

import java.util.Scanner;

public class kullaniciGiris {
    public static void main(String[] args) {
        String userName,userpassword,passwordreset;
        Scanner scan=new Scanner(System.in);
        System.out.println("kullanıcı adı giriniz");
        userName=scan.nextLine();
        System.out.println("kullanıcı şifresi giriniz");
        userpassword=scan.nextLine();
        if (userName.equals("patika")&& userpassword.equals("java1234")) {
            System.out.println("giriş yaptınız !");
        }
        else {
            System.out.println("Bilgileriniz Yanlış");
            System.out.println("şifrenizi sırıflamak istermisiniz");
            passwordreset=scan.nextLine();
            if (!passwordreset.equals("java1234")) {
                System.out.println("Şifre oluşturuldu");
            }
            else {
                System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
            }
        }

    }
}
