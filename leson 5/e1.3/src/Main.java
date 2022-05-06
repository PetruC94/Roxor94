import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a= scanner.nextInt();
        int b= scanner.nextInt();
        int k= scanner.nextInt();
        if (k % a == 0 && k / a < b)  {
            System.out.println("YES");
        } else if (k % b == 0 && k / b < a)

        System.out.println("NO");
    }
}
