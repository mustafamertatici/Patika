package patika;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {

        Scanner inp=new Scanner(System.in);
        int right=3;
        int balance=1500;
        int select;
        while (right>0){

            String userName,password;
            System.out.println("Kullanıcı adını giriniz");
            userName=inp.nextLine();
            System.out.println("Kullanıcı parola giriniz");
            password=inp.nextLine();
            if (userName.equals("patika")&&password.equals("dev123")) {
                System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz!");
                do {

                    System.out.println("1-Para yatırma\n2-Para Çekme\n3-Bakiye Sorgula\n4-Çıkış Yap");
                    System.out.println("Lütfen yapmak istediğin işlemi seçin");
                    select=inp.nextInt();
                    if (select == 1) {
                        System.out.println("Para Miktarı: ");
                        int price=inp.nextInt();
                        balance+=price;
                    } else if (select==2) {
                        System.out.println("Para Çekme: ");
                        int price=inp.nextInt();
                        if (price >balance) {
                            System.out.println("Bakiye yetersiz.");
                        }
                        else {
                            balance-=price;
                            System.out.println("Yeni bakiye: "+balance);
                        }
                        balance-=price;
                    }
                    if (select == 3) {
                        System.out.println("Bakiye = " + balance);
                    }
                }
                while (select!=4);
                System.out.println("Tekrar görüşmek üzere");
                break;
        }
            else {
                right--;
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
                }
                else {
                    System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
                    System.out.println("Kalan hak" + right);
                }
            }

        }

    }
}
