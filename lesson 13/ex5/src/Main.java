public class Main {
    public static void main(String[] args) {
        Book book=new Book( "Java 8 in Action",2017, new String[]{"Mario,Fucso,Alan,Mycroft"} );
    print( book );
    }

    public static void print(Book title){
        System.out.println(title.toString());
    }
}