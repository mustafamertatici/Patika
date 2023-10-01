package patika;
import java.util.Scanner;

public class NTaneSayiMaxMin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kaç sayı gireceksiniz? ");
        int n = scanner.nextInt();

        if (n <=0) {
            System.out.println("Lütfen pozitif bir sayı girin.");

        }

        int min= Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;

        for (int i = 0; i <n ; i++) {
            System.out.println("Sayı"+(i+1)+": ");
            int num=scanner.nextInt();
            if (num < min) {
                min=num;
                if (num >max) {
                    max=num;
                }
        }
            System.out.println("En küçük sayı: " + min);
            System.out.println("En büyük sayı: " + max);
            scanner.close();
        }
    }
}
