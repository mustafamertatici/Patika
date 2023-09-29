package patika;

import java.util.Scanner;

public class MetotHesMak {
    static int sum(int a,int b){
        int result=a+b;
        System.out.println("Toplam: "+result);
        return a+b;
    }
    static  int minus(int a,int b){
        int result=a-b;
        System.out.println("Çıkarma = " + result);
        return result;
    }
    static  int times(int a,int b){
        int result=a*b;
        System.out.println("Çarpma = " + result);
        return result;
    }

    static int divided(int a, int b){
        if (b == 0) {
            System.out.println("İkinci sayı 0'dan farklı olmalı");
            return 0;
        }
        int result=a/b;
        System.out.println("Bölüm = " + result);
        return result;
    }
    static int power(int a, int b){
        int result=1;
        for (int i = 0; i <=b ; i++) {
            result*=a;
        }
        return result;
    }

    static int mod(int a, int b){
        return a%b;
    }

    static int area(int a, int b){
        return a*b;
    }

    static void  calc(int a, int b){
        System.out.println("Çevresi: "+(2*(a+b)));
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int select;
        String menu= "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";
        while (true){
            System.out.println(menu);
            System.out.println("Bir işlem seçiniz");
            select=inp.nextInt();
            if (select == 0) {
                break;
            }
            System.out.println("ilk sayıyı giriniz: ");
            int a=inp.nextInt();
            System.out.println("ikinci sayıyı giriniz: ");
            int b=inp.nextInt();

            switch (select) {
                case 1:
                    sum(a, b);
                    break;

                case 2:
                    minus(a,b);
                    break;
                case 3:
                    times(a,b);
                    break;
                case 4:
                    divided(a,b);
                    break;
                case 5:
                    System.out.println("Üs Hesabı: "+power(a,b));
                    break;
                case 6:
                    System.out.println("Mod: "+mod(a,b));
                    break;

                case 7:
                    calc(a,b);
                    break;
                case 8:
                    System.out.println("Dikdörtgenin alanı: "+area(a,b));
                    break;

                default:
                    System.out.println("Geçersiz bir işlem girdiniz :");

            }
        }
        System.out.println("Güle Güle");
    }
}
