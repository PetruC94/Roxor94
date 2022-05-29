public class Main {
    public static void main(String[] args) {
        Box box = new Box();
        box.length = 20;
        box.height = 10;
        box.width = 15;

        box.innerBox = new Box();
        box.innerBox.length = 5;
        box.innerBox.height = 2;
        box.innerBox.width = 2;

    }
}