

public class Main {
    public static void main(String[] args) {
    for (DangerLevel level:DangerLevel.values()){
        System.out.println(level.name()+" "+level.getDangerLevel());
    }

    }
}
