import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number= scanner.nextInt();
        if(number==1)
            System.out.println("no army");
        else if (number<20) {
            System.out.println("pack");
            
        } else if (number<=249) {
            System.out.println("thorng");
            
        } else if (number<=999) {
            System.out.println("zounds");

            
        } else if (number>1000) {
            System.out.println("legion");

        }
    }
}