
import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner( System.in );
        String first=sc.nextLine();
        String second=sc.nextLine();
        String temp1=first.replace( " ","" );
        String temp2=second.replace( " ","" );
        System.out.println( temp1.equals( temp2 ));

    }
}
