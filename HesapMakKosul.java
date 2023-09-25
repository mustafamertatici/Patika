package patika;

import java.util.Scanner;

public class HesapMakKosul {
    public static void main(String[] args) {
        int a,b;
        Scanner scan=new Scanner(System.in);
        System.out.println("ilk sayıyı giriniz");
        a=scan.nextInt();
        System.out.println("ikinci sayıyı giriniz");
        b=scan.nextInt();
        System.out.println("Seçiminizi giriniz(toplama1/çıkarma2/çarpma3/bölme4)");
        int secim= scan.nextInt();

        switch (secim){
            case 1:
                System.out.println((a+b)+"toplamı");
             break;
            case 2:

                System.out.println((a-b)+"çıkarma");
                break;
            case 3:

                System.out.println((a*b)+"çarpma");
                break;
            case 4:

                System.out.println((a/b)+"bölme");
                break;
        }

    }
}
