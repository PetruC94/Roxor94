

public class Main {
    public static void main(String[] args) {
        Patient john=new Patient();
        john.name="John";
        john.age=25;
        john.height=175;
            System.out.println(john.name+" "+john.age+" "+john.height);
        Patient alice=new Patient();
        alice.name="Alice";
        alice.age=24;
        alice.height=170;
        System.out.println(alice.name+" "+alice.age+" "+alice.height);
    }
}