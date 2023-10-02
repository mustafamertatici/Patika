package patika;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class guessNumber {
    public static void main(String[] args) {
        Random rand =new Random();
        int number=rand.nextInt(100);
       // int number=(int) (Math.random()*100);

        Scanner input=new Scanner(System.in);
        int right=0;
        int selected;
        int[] wrong=new int[5];
        boolean isWin=false;
        boolean isWrong=false;
        System.out.println(number);
        while (right<5){
            System.out.println("lütfen tahmininizi giriniz: ");
            selected=input.nextInt();
            if (selected <0|| selected>99) {
                System.out.println("Lütfen 0-100 arasında değer giriniz");
                if (isWrong ) {

                    right++;
                    System.out.println("çok hatalı giriş yaptınız kalan hak: "+(5-right));
                }
                else {
                    isWrong=true;
                    System.out.println("bir daha hatalı grişinizde can hakkınızdan düşülecektir");
                }
                continue;
            }
            if (selected == number) {
                System.out.println("Tebrikler, doğru tahmin ! Tahmin ettiğniz sayı"+number);
                isWin=true;
                break;
            }
            else {


                System.out.println("Hatalı bir sayı girdiniz");
                if (selected >number) {
                    System.out.println(selected+"sayısı, gizli sayıdan büyüktür");
                }
                else {
                    System.out.println(selected+"sayısı gizli sayıdan küçüktür");
                }
                wrong[right++]=selected;
                System.out.println("kalan hakkı: "+(5-right));
            }
        }
        if (!isWin ) {
            System.out.println("Kaybettiniz");
            System.out.println("Tahminleriniz"+ Arrays.toString(wrong));
        }
    }
}
