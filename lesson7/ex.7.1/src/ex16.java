import java.util.Scanner;

public class ex16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + "" + str.charAt(i));
        }
    }
}
