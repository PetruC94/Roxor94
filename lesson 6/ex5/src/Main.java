import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = Math.abs(j - i);
            }
        }
        for (int i = 0; i < n; i++) {
            String str = Arrays.toString(matrix[i]);

            System.out.println(str);
        }
    }
}