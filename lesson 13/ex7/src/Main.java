public class Main {
    public static void main(String[] args) {
        Person person=new Person( "Case Maxwel",30 );
        Person patient=new Patient( "John Purcell",30,182 );
    print( person );
    print( patient );
    }

public static void print(Person pers){
    System.out.println(pers.toString());

}
}