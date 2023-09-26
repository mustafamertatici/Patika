package patika;

import java.util.Scanner;

public class SinifDurumuHesap {
    public static void main(String[] args) {
        //değişkenleri oluştur
        int mat,fizik,kimya,türkçe,tarih,müzik;

        Scanner inp=new Scanner(System.in);
        //kullanıcıdan değerleri al
        System.out.println("matematik notunuz");
        mat= inp.nextInt();
        System.out.println("fizik notunuz");
        fizik= inp.nextInt();
        System.out.println("kimya notunuz");
        kimya= inp.nextInt();
        System.out.println("türkçe notunuz");
        türkçe= inp.nextInt();

        System.out.println("müzik notunuz");
        müzik= inp.nextInt();

        double ortalama= (mat+fizik+kimya+türkçe+müzik)/5;
        System.out.println(ortalama);
        if (ortalama>0 && ortalama<100) {

            if (ortalama >55) {
                System.out.println("Sınıfı geçtiniz");

            }
            else {
                System.out.println("Kaldınız");
            }

        }

        else {
            System.out.println("ortalama değeri dışında bir değer");
        }
    }

}
