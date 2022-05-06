import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Dati 3  numere: ");
     int a= scanner.nextInt();
        int b= scanner.nextInt();
        int c= scanner.nextInt();

        System.out.println(a == b && b == c);

    }

}