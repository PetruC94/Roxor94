import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Dati o cifra de la  0 pina la 1000: ");
        int number= scanner.nextInt();

            int a=number%10;
            number /=10;
            int b=number%10;
            number /=10;
            int c=number%10;
            int suma=c+b+a;
            System.out.print("Suma celor 3 numere este"+" "+suma);
    }
}