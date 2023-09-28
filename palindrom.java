package patika;

public class palindrom {
    static boolean isPalindrom(int number){
        int temp=number,reversnumber=0,lastNumber;
        while (temp!=0){
            lastNumber=temp%10;
            reversnumber=(reversnumber*10)+lastNumber;
            temp/=10;
        }
        if (number == reversnumber) {
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println(isPalindrom(101));
    }
}
