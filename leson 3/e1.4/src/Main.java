import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Dati valori lui H, B si A");
        int h= scanner.nextInt();
        int a= scanner.nextInt();
        int  b= scanner.nextInt();
        if (h <= 100 && a <= 100 && b <= 100 ) {
            int v = (h / (a - b)) - a / (a - b) + 1;

            System.out.println("Melcul va ajunge in virf " + v + " zile");
        }
        else System.out.println("Valoarea este mai mare decit 100");




        }



}