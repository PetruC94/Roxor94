import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        //Function<String,String> reverse->StringBuilde
        StringBuilder stringBuilder=new StringBuilder();
       // StringBuilder reverse=stringBuilder.reverse();

        Function<String,String>lamda=StringBuilder-> stringBuilder.reverse().toString();
        String reversed=lamda.apply( "Petru" );
        System.out.println(reversed);
    }
}