public class Main {
    public static void main(String[] args) {
        User user=new User( "javagod","James","Gosling" );
    print( user );
    }
public static void print(User log){
    System.out.println(log.toString());
}
}