package patika;
import java.util.Arrays;
import java.util.Scanner;
public class arraySortReceivedFromUser {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //kullanıcıdan dizinin boyutunu alalım.
        System.out.println("Dizinin boyutu n:");
        int n = input.nextInt();
        //kullanıcıdan dizinin elemanlarını almak için bir dizi oluşturun
        int[] dizi = new int[n];
        //en tuşunu engellemek için
        input.nextLine();
        //kullanıcı elemanları girmesini isteyin ve diziye ekleyin.
        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + ".Elemanı :");
            dizi[i] = input.nextInt();

        }
        // Diziyi küçükten büyüğe sıralayın.
        Arrays.sort(dizi);

        //sıralanmış diziyi ekrana yazdır
        System.out.println("Sıralama: ");
        for (int i = 0; i < n; i++) {
            System.out.print(dizi[i] + " ");

        }
        input.close();

    }
    }
