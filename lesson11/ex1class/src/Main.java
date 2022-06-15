import java.time.DayOfWeek;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner( System.in );
        String dayStr= sc.nextLine().toUpperCase();
        DayOfWeek day= DayOfWeek.valueOf(dayStr);
        System.out.println(dayStr);
    switch (day){
        case FRIDAY -> System.out.println("It's friday dude!");
        case MONDAY -> System.out.println("It's  time go to work");
        default -> System.out.println("Ordinary day");
    }
    }
}