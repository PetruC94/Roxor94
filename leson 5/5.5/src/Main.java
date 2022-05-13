import java.util.Scanner;

public class Main {
    /**
     * Acesta este un program
     * @param args  this is args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        int sum=n;
       while (n!=0){
           if(sum>=1000){
               sum-=1000;
               break;
           }
           n=scanner.nextInt();
           sum+=n;
       }
        System.out.println((sum));
    }
    }

