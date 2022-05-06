import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
                int a= scanner.nextInt();
                int b= scanner.nextInt();
                int h= scanner.nextInt();
                if(a<b &&a==h)
                    System.out.println("Deficienxy");
        if(a<b &&b==h)
            System.out.println("exces");
        else
            System.out.println("Normal");
    }
}