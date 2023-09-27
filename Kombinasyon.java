package patika;

import java.util.Scanner;

public class Kombinasyon {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Bir sayı giriniz ");
        int sayi= scan.nextInt();
        System.out.println("sayı giriniz n");
        int n= scan.nextInt();
        System.out.println("sayı giriniz r");
        int r= scan.nextInt();
        System.out.println("C("+ n + "," + r + ")="+kombinasyon(n,r));
    }
    public static int faktoriyel(int sayi){
         int total=1;
        if (sayi >0) {
            for (int i = 1; i < sayi; i++) {
                total=total*i;
            }
        }
        return total;
    }
    public static int kombinasyon(int n, int r){
         return faktoriyel(n)/faktoriyel(r)*faktoriyel((n-r));
    }
}
