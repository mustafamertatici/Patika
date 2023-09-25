package patika;

import java.util.Scanner;

public class vkiIndeks {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz :");
        double b=scan.nextDouble();
        System.out.println("Lütfen kilonuzu giriniz : ");
        double k= scan.nextDouble();
        double vki=k/(b*b);
        System.out.println("Vücut Kitle İndeksiniz : "+vki+"dir");
    }
}
