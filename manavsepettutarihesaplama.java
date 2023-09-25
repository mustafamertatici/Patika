package patika;

import java.util.Scanner;

public class manavsepettutarihesaplama {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double salatalık=3.14;
        double elma=4.11;
        double kabak=2.22;
        double domates=0.95;
        double patlıcan=7.00;

        System.out.println("Salatalık kaç kile");
            double salatalikkilo= scan.nextDouble();
        System.out.println("elma kaç kile");
        double elmakilo= scan.nextDouble();
        System.out.println("kabak kaç kile");
        double kabakkilo= scan.nextDouble();
        System.out.println("domates kaç kile");
        double domateskilo= scan.nextDouble();
        System.out.println("patlıcan kaç kile");
        double patlıcankilo= scan.nextDouble();

        double toplam=(salatalık*salatalikkilo)+(elma*elmakilo)+(kabak*kabakkilo)+(domates*domateskilo)+(patlıcan*patlıcankilo);

        System.out.println("toplam tutar:    "+toplam);

    }





}
