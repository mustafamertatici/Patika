package patika;

import java.util.Scanner;

public class TersUçgen {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Basamk Sayı giriniz");
        int n= inp.nextInt();

        for (int i = n; i >=1 ; i--) {
            for (int j = (n-i); j >=1 ; j--) {
                System.out.print(" ");
            }
            for (int j = (2*i)-1; j>=1 ; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
