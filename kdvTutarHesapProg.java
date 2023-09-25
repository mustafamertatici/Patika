package patika;

import java.util.Scanner;

public class kdvTutarHesapProg {
    public static void main(String[] args) {

       double tutar;
        Scanner inp=new Scanner(System.in);
        System.out.println("Ücret tutarı giriniz");
        tutar= inp.nextDouble();
        if (tutar>1000) {
           double kdvoranı=0.08;
            double kdvTutar=tutar*kdvoranı;
            double kdvlitutar=tutar+kdvTutar;
            System.out.println("kdvsiz tutar "+tutar);
            System.out.println("kdvoranı = " + kdvoranı);
            System.out.println("kdvlitutar = " + kdvlitutar);
            System.out.println("kdvTutar = " + kdvTutar);
        }
        else {
          double  kdvoranı=0.18;
            double kdvTutar=tutar*kdvoranı;
            double kdvlitutar=tutar+kdvTutar;
            System.out.println("kdvsiz tutar "+tutar);
            System.out.println("kdvoranı = " + kdvoranı);
            System.out.println("kdvlitutar = " + kdvlitutar);
            System.out.println("kdvTutar = " + kdvTutar);
        }

    }
}
