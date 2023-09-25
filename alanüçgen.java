package patika;

import java.util.Scanner;

public class alanüçgen {//üçgenin alanı
    public static void main(String[] args) {
        double a,b,c;
        Scanner inp=new Scanner(System.in);
        System.out.println("1. kenarı girelim");
        a=inp.nextDouble();
        System.out.println("2. kenarı girelim");
        b=inp.nextDouble();
        System.out.println("3. kenarı girelim");
        c=inp.nextDouble();
        double u=(a+b+c)/2;
        double  alan=Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("alan = " + alan);

    }

}
