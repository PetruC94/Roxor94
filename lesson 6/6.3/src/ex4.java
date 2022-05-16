import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner( System.in );
        int arraysize=sc.nextInt();
        int[] arr =new int[arraysize];
        for (int i = 0; i < arraysize; i++) {
            int temp= sc.nextInt();
            arr[i]=temp;

        }
//<---
        int count=0;
        int tempcount=0;
        for (int i = 0; i < arr.length; i++) {
            int precedent=arr[i-1];
            int curent=arr[i];
            if (precedent<curent){
                tempcount++;
                if(tempcount>count) {
                    count++;
                }
                else{
                    tempcount=0;
                }
            }
        }
        System.out.println(count);




    }
}
