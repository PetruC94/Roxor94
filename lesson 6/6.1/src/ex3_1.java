import java.util.Arrays;
import java.util.Scanner;

public class ex3_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int n=sc.nextInt();
        int [] arr=new int[a];
        int suma=0;
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
            if(arr[i]>n)
                suma+=arr[i];
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(suma);
    }
}

