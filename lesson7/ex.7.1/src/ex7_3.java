
import java.util.Scanner;

public class ex7_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner( System.in );
        String line=sc.nextLine();
        String[] words=line.split( " " );
   String result="";//three
        for (int i=1;i<words.length;i++) {
            String  word=words[i];
            if (result.length() < word.length()) {
                result = word;
            }


        }
        System.out.println( result );
    }
}
  //  one twoo three four six