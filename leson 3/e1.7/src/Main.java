import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Dati o valoare: ");
        int a= scanner.nextInt();

        if (a<10&& a>0 )

            System.out.println(true);
    else
            System.out.print(false);
    }

}