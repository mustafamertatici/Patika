package patika;

import java.util.Scanner;

public class EbobEkokWhile {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("N1 Sayısı giriniz");
        int n1 = inp.nextInt();

        System.out.println("N2 Sayısı giriniz");
        int n2 = inp.nextInt();

        //Ekok
        int i = 1;
        while (i <= (n1 * n2)) {
            if (i % n1 == 0 && i % n2 == 0) {
                System.out.println("Ekok :"+i);
                break;
            }
            i++;
        }

        //Ebob
        int ebob=1;
        int k = n1;
        while (k>=1){
            if (n1%k == 0 && n2%k==0) {
                ebob=k;
                System.out.println("Ebob :"+ebob);
                break;
            }

            k--;
        }



    }
}