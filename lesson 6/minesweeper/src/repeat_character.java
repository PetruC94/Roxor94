import java.util.Arrays;
import java.util.Scanner;

public class repeat_character {
            public static void main(String[] args) {
                Scanner sc=new Scanner( System.in );
                int n=sc.nextInt();
                char c = 'X';


                // creates char array with 10 elements
                char[] chars = new char[n];

                // fill each element of chars array with 'x'
                Arrays.fill(chars, c);

                // print out the repeated 'X'
                System.out.println(String.valueOf(chars));
            }
        }


