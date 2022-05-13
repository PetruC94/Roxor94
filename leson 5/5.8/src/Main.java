import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        long produs = 1;

        for (long i = a; i < b; i++) {
            produs*= i;
        }
        System.out.println(produs);
    }
}
