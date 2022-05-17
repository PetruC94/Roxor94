import java.util.Scanner;

public class ex4_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner( System.in );
    String date=sc.nextLine();
    String temp=date.replace("-","/"  );
        System.out.println(temp);
    }
}
