public class Main {
    public static void main(String[] args) {
        Shape shape=new Shape();
        Circle circle=new Circle( 6 );
        Square square=new Square( 4 );
        Triangle triangle=new Triangle( 7,4 );
        Rectangle rectangle=new Rectangle( 4,6 );
printAreaofShape( shape );
printAreaofShape( circle );
printAreaofShape( square );
printAreaofShape( triangle );
printAreaofShape( rectangle );
    }
    public static void printAreaofShape(Shape shape){
        System.out.println(shape.area());
    }
}