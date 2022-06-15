public class Main {
    public static void main(String[] args) {
        Clock clock = new Clock();
        clock.hours = 12;
        clock.minutes = 00;
// time is 10:59
        clock.next(); // time is 11:00


    }
}