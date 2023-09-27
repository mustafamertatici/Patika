package patika;

import java.util.Scanner;

public class usluSayi {
    public static void main(String[] args) {
        int n,k;
        Scanner input=new Scanner(System.in);
        System.out.println("Üssü alınacak sayı");
        n= input.nextInt();
        System.out.println("Üs olacak sayı");
        k=input.nextInt();
        int total=1;
        //3^4=3*3*3*3
        /*
        int i=1;
        while (i<=k){
            total*=n;
            i++;

        }
        */

        for (int i = 1; i <=k ; i++) {
            total=total*n;
        }
        System.out.println(total);
    }
}
