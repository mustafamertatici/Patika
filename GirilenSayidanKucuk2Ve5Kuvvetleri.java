package patika;

import java.util.Scanner;

public class GirilenSayidanKucuk2Ve5Kuvvetleri {
    //Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int sayi,total = 0;
        System.out.println("Sayı giriniz");
        sayi= inp.nextInt();
        for (int i = 1; i <sayi ; i*=4) {
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("******************");
        for (int j = 1; j <sayi ; j*=5) {
            System.out.print(j+" ");
        }
    }
}
