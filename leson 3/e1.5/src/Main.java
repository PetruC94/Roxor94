import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Dati Distanta dintre orase:");
        double d1= scanner.nextDouble();
        double d2=scanner.nextDouble();
        double v=d1/d2;
        System.out.println("Distanta dintre orase este "+v+" km");
    }
}