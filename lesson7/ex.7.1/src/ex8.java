import java.util.Scanner;

public class ex8 {
    public static String concatenateStringsWithoutDigits(String[] strings) {
        StringBuilder builder = new StringBuilder();
        for (String str : strings) {
            builder.append(str.replaceAll("\\d", ""));
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = scanner.nextLine().split("\\s+");
        String result = concatenateStringsWithoutDigits(strings);
        System.out.println(result);
    }
}
