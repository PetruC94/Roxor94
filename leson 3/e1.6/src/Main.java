import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Dati doua valori:");
        double a= scanner.nextDouble();
        double b= scanner.nextDouble();
        double c=b-a;
        System.out.println("Diferenta dintra al doilea si primul este: "+c);

    }
}