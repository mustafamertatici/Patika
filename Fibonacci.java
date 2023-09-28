package patika;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int input;
        System.out.println("Sayı giriniz");
        input= inp.nextInt();
        int sayi1=0;
        int sayi2=1;
        int top;
        System.out.println(input+ "Fibonacci serisi");
        for (int i = 0; i <=input ; i++) {
            System.out.print(sayi1+ ",");
            top=sayi1+sayi2;
            sayi1=sayi2;
            sayi2=top;

        }
    }
}
