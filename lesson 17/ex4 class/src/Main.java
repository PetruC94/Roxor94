import java.util.*;
public class Main {
    public static void main(String[] args) {
        Set<String>nameSet=
                new TreeSet<>(Arrays.asList( "Mr Green","MrYellow","Mr Red" ));
        for (String s : nameSet) {
            System.out.println(s);
        }
    }

}