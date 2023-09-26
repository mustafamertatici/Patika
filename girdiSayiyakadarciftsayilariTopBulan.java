package patika;

import java.util.Scanner;

public class girdiSayiyakadarciftsayilariTopBulan {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int sayi,total = 0;
        System.out.println("Sayı giriniz");
        sayi= inp.nextInt();

        for (int i = 0; i <sayi ; i++) {
            if (i%2==1) {

                total=total+i;
            }

        }
        System.out.println("total = " + total);
    }
}
