import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner( System.in );
        String date=sc.nextLine();
        String[] parts = date.split("-");
        String part1=parts[0];
        String part2=parts[1];
        String part3=parts[2];
        String date1=part1+"/"+part2+part3;
        System.out.println(date1);


    }
}
