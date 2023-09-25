package patika;

import java.util.Scanner;

public class dairealanveçevrehesaplama {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("dairenin yarıçapı  değerini giriniz");
        int r=scan.nextInt();
        System.out.println("dairenin dilimi  değerini giriniz");
        int a=scan.nextInt();
        double alan=Math.PI*r*r;
        double çevre=2*Math.PI*r;
        double merkezölçü=(Math.PI*(r*r)*a)/360;
        System.out.println("dairenin alanı: " + alan);
        System.out.println("dairenın çevresi: " + çevre);
        System.out.println("dairenın merkez açı ölçüsü: " + merkezölçü);

    }
}
