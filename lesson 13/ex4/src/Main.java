public class Main {
    public static void main(String[] args) {
        Account account=new Account(  10,"123-456-789",2000L);
print( account );
    }
    public static void print(Account acc){
        System.out.println(acc.toString());
    }
}