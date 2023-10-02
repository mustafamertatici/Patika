package patika;
import java.util.Arrays;
public class RepeatingEvenNumbers {
    public static void main(String[] args) {
        int[] array = {3, 335,3, 35, 546,65, 65, 4875,48, 5165, 5165,4875,48, 525252, 25, 5, 52, 515, 15, 52959, 8, 82828, 88, 8848, 88, 8};
        Arrays.sort(array);
        System.out.println("Dizi: " + Arrays.toString(array));
        System.out.println("Tekrar eden çift sayılar");

        for (int i = 1; i <array.length-1 ; i++) {
            if (array[i]==array[i-1]&&array[i]%2==0&&array[i]!=array[i+1]) {
                System.out.println(array[i]+" ");
            }
        }
    }

}
