package patika;
import java.util.Scanner;
import java.io.*;

public class ucakBiletiHesap {
    public static void main(String[] args) {
        /*
        Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın. Kullanıcıdan Mesafe (KM),
        yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın. Mesafe başına ücret 0,10 TL / km olarak alın.
        İlk olarak uçuşun toplam fiyatını hesaplayın ve sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;

        Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır.
        Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
        Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
        Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
        Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
        Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.
         */

       Scanner inp=new Scanner(System.in);
       int km,tip,yas;
       double netfiyat,brutfiyat;
        System.out.println("Mesafeyi km türünden giriniz :");
        km=inp.nextInt();
        System.out.println("Yaşınızı giriniz :");
        yas=inp.nextInt();
        System.out.println("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ):");
        tip=inp.nextInt();
        double normalfiyat,yasindirimi,tipindirimi;
        if (yas>0 && km>0&&(tip==1||tip==2)) {
            System.out.println("girdiler doğru");
            normalfiyat=km*0.10;
            if (yas <12) {
            yasindirimi=normalfiyat*0.5;//indirim oranı hesaplama
            } else if (yas>=12 &&yas<=24) {
                yasindirimi=normalfiyat*0.10;
            } else if (yas>65) {
                yasindirimi=normalfiyat*0.30;
            }
            else {
                yasindirimi=0;
            }

            normalfiyat=normalfiyat-yasindirimi;//fiyattan indirim payını çikariyorsun
            if (tip==2) {
                tipindirimi=normalfiyat*0.20;
                normalfiyat-=tipindirimi;
                normalfiyat*=2;
            }
            System.out.println("bilet tutarı"+normalfiyat);
        }
        else {
            System.out.println("girdiler yanlış");
        }



    }
}
