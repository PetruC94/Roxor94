import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a= scanner.nextInt();
        switch (a) {
            case 1:
                System.out.println("Move up");
                break;
            case 2:
                System.out.println("Move down");
                break;
            case 3:
                System.out.println("Move left");
                break;
            case 4:
                System.out.println("Move Right");
                break;
            case 0:
                System.out.println("do not move");
            default:
                System.out.println("error");

        }
        }
    }
