import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine().toLowerCase();

        String reversed = new StringBuilder(word).reverse().toString();

        System.out.println(word.equals(reversed) ? "yes" : "no");
    }
}
