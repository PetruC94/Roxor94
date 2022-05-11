import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double Pi=3.14;
        System.out.println("Alegeti triangle sau rectangle sau circle ");
        switch (scanner.next()) {
            case "triangle" -> {
                System.out.println("Dati valori lui A B C");
                double a= scanner.nextDouble(),
                        b = scanner.nextDouble(),
                        c = scanner.nextDouble(),
                        p = ((a + b +c) / 2),
                        S = Math.sqrt(p * (p - a) * (p - b) * (p - c));
                System.out.println("Aria triunghiului este "+S);
            }
            case "rectangle" -> {
                System.out.println("Dati valori lui A si B");
                double a= scanner.nextDouble(),
                        b = scanner.nextDouble();
                System.out.println("Aria dreptunghiului este "+a * b);
            }
            case "circle" -> {
                System.out.println("Dati valori lui R");
                double r = scanner.nextDouble();
                System.out.println("Aria cercului este "+Pi*Math.pow(r,2));
            }
            default -> {
            }
        }

    }

}

