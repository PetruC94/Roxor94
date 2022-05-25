import java.util.Scanner;
public class ex7_6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        String txt = scanner.nextLine();
        char el = txt.charAt( 0 );
        int count = 0;
        for (int i = 0; i < txt.length(); i++) {
            if (txt.charAt( i ) == el) {
                count++;
            } else {
                System.out.print( el );
                System.out.print( count );
                el = txt.charAt( i );
                count = 1;
            }
        }
        System.out.print( el );
        System.out.print( count );

    }
}