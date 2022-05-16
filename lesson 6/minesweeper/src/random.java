import java.util.Arrays;
import java.util.Random;

public class random
{
    public static void main(String[] args)
    {

        String[][] arr=new String[9][1];
        System.out.println(Arrays.toString(arr));
        Random r=new Random();

        int randomNumber=r.nextInt(arr.length);
        System.out.println(Arrays.toString(arr[randomNumber]));
    }
}