package patika;

import java.util.Scanner;

public class havaSicakliginaEtkinlikOnerme {
    public static void main(String[] args) {

         Scanner inp=new Scanner(System.in);
        System.out.println("Hava sıcaklığını söyleyiniz");
        int heat= inp.nextInt();
        if (heat < 5) {
            System.out.println("Kayak yapabilirsiniz");
        } else if (heat>=5 && heat<=25) {

            if (heat > 5 && heat<15) {
                System.out.println("Sinema");
            }
            if (heat > 15 && heat<25) {
                System.out.println("Pikniğe gidebilirsiniz");
            }
        }
        else {
            System.out.println("Yüzmeye gidebilirsinz");
        }


    }
}
