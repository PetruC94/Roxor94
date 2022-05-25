import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Mineswapeer_part2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in );
        System.out.print( "Cite mine dorim sa avem: " );
        int numberOfMines = sc.nextInt();
        char[][] arr = new char[9][9];
            fillWithDots( arr,'.' );
            Generatemines( arr,numberOfMines);
            printGame( arr );

    }
    public static void printGame(char[][]arr){
        //Afisarea la ecran
        for (char[] chars : arr) {
            for (char aChar : chars) {
                System.out.print( aChar );
            }
            System.out.println();

        }

    }
    public static void fillWithDots(char[][]arr, char Char){
        //Adaugarea minelor in tablou
        for (char[] value : arr) {
            Arrays.fill( value,Char);
        }
    }
    public static void Generatemines(char[][]arr,int nrofmines){
        //Generarea Minelor Aleatoriu
        Random random = new Random();
        int count = 0;
        while (count < nrofmines) {
            int i = random.nextInt( 9 );
            int j = random.nextInt( 9 );
            if (arr[i][j] != 'X') {
                arr[i][j] = 'X';
                count++;
            }
        }
    }

}