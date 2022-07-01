import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner( System.in );
         String s= scanner.nextLine();
        ArrayList<String>list=new ArrayList<>();
        list.add( s );
        System.out.println(s);
    }
}