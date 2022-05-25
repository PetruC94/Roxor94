import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in );
        int from = sc.nextInt();
        int to = sc.nextInt();
            sumInRange( from,to );
        System.out.println();
    }

    public static void sumInRange(int from, int to) {
        int sum=0;
        for (int i = from;  i < to; i++) {
            sum+=i;
        }
        System.out.println(sum);

    }
}