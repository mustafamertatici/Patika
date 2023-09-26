package patika;

import java.util.Scanner;

public class girdiSayiyakadarciftsayilaribulan {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int sayi;
        System.out.println("Sayı giriniz");
        sayi= inp.nextInt();

        for (int i = 0; i <sayi ; i++) {
            if (i%2==0) {
                System.out.print(i+" ");
            }
        }

    }
}
