import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer>List=new ArrayList<>();
        List.add(2 );
        List.add(0 );
        List.add(1 );
        List.add(7 );
        for (Integer integer : List) {
            System.out.print(integer);
        }
    }
}