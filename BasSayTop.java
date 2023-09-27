package patika;

import java.util.Scanner;

public class BasSayTop {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int sayi,total=0;
        System.out.println("Sayı giriniz");
        sayi= inp.nextInt();

        // Bir sayının son basamağını bulma
        // 2451 % 10 = 1



        while (sayi>0){
           total+=sayi%10;
           sayi/=10;
        }
        System.out.println("total = " + total);
    }
}
