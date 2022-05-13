import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nr = 0;
        int max = nr;
        do {
            nr = scanner.nextInt();
            max = Math.max(nr, max);
        } while (nr != 0);
        System.out.println(max);

    }
}