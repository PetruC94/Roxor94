import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner( System.in );
                //endsWith(suffix)
        String city=sc.nextLine();
        boolean temp = city.endsWith( "burg" );
        System.out.println(temp);
    }
}
