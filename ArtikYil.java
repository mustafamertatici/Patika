package patika;

import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int yil;
        System.out.println("Yıl giriniz");
        yil=inp.nextInt();

        if ((yil%4 == 0&& yil%100!=0) ||yil%400==0) {
            System.out.println("Artık yıldır");
        }
        else {
            System.out.println("Artık yıl değildir");
        }
    }
}
