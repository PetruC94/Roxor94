import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Minesweeper_part_1 {
    public static void main(String[] args) {


        System.out.println();
        System.out.println(".X.......");
        System.out.println(".....X..X");
        System.out.println("....X....");
        System.out.println("......X..");
        System.out.println("..X......");
        System.out.println("....X....");
        System.out.println("..X......");
        System.out.println("..X......");
        System.out.println("......X..");
        new Scanner(System.in);
        Random rnd = new Random();
        String[][] arr=new String[9][1];
        arr[0][1]=".X.......";
        arr[0][2]=".....X..X";
        arr[0][3]="....X....";


        int  randomNumber=rnd.nextInt(arr.length);
        System.out.println( Arrays.toString(arr[randomNumber]));

        for (int i1 = 0; i1 < 10; i1++) {
            System.out.println(rnd.nextInt(10));// 0 - 9
        }
    }
}