package patika;

import java.util.Scanner;

public class NotOrtHesProg {
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
        System.out.println("tarih notunuz");
        tarih= inp.nextInt();
        System.out.println("müzik notunuz");
        müzik= inp.nextInt();

       double ortalama= (mat+fizik+kimya+türkçe+tarih+müzik)/6;
        System.out.println(ortalama);

        System.out.println((ortalama > 60) ? "geçti" : "kaldı");
    }
}
