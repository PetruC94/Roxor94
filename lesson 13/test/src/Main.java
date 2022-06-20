public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape();
        Circle circle = new Circle( 6 );
        Square square = new Square( 4 );
        Triangle triangle = new Triangle( 7, 4 );
        Rectangle rectangle = new Rectangle( 4, 6 );
        Shape[] shapes = {shape, circle, square, triangle, rectangle};
        for (Shape shape1 : shapes) {
            System.out.println( shape1.area() );
        }
    }
}