package patika.boxingmatch;

public class main {
    public static void main(String[] args) {
        Fighter f1=new Fighter("Kanan kazgan",20,85,85,40);
        Fighter f2 =new Fighter("Savaş Cebeci",10,120,100,30);


        Match match=new Match(f1,f2,85,100);
        match.run();
    }
}
