import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //citeste tabloul
        int a = in.nextInt();
        int[] array = new int[a];
        int sum = 0;
//citeste un element din tablou
        for (int i=0;i<array.length;i++) {
            array[i] = in.nextInt();
        }
            int n = in.nextInt();

// acum calculeaza numerele din tablou
        for(int valoare:array){
            if(valoare>n){
                sum+=valoare;
            }
        }
        System.out.println(sum);
    }
}
