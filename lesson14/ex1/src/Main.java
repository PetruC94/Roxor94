public class Main {
    public static void main(String[] args) {
        IntBinaryOperation adunarea = new Addition(7,8);
        IntBinaryOperation produs = new Multiplication(7,8);
        IntBinaryOperation[] aritmetic={adunarea,produs};
        for (IntBinaryOperation IntBinaryOperatio : aritmetic) {
           int result=IntBinaryOperatio.perform();
            System.out.println(result);
        }
    }
}