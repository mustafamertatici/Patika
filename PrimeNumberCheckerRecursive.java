package patika;
import java.util.Scanner;

public class PrimeNumberCheckerRecursive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        int num = scanner.nextInt();

        if (isPrime(num,2)) {
            System.out.println(num + " asal bir sayıdır.");
        }
        else {
            System.out.println(num + " asal bir sayı değildir.");
        }

    }
    public static boolean isPrime(int num, int divisor){
        if (num <=2) {
            return (num==2);
        }
        if (num % divisor==0) {
            return false;
        }

        if (divisor*divisor>=num) {
            return true;
        }
        return isPrime(num,divisor+1);
    }
}
