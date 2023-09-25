package patika;

import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {
        /*
        gidilen kilometre bilgisine göre taksimetre tutarı hesaplayan program yazın
        taksimetre km başın:2.20
        kısamesafe=20 ------------20 tl altı yolculuklar için
        taksi metre açılış=10
        */

        Scanner scan=new Scanner(System.in);
        System.out.println("gidilen km  değerini giriniz");
        double km=scan.nextDouble();
        double price=10+(km*2.20);
        if (price <20) price=20;
        System.out.println("Taksimetre"+price);


    }
}
