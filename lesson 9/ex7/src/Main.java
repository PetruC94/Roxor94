import java.util.Optional;

public class Main {

    public static void main(String[] args) {

        User user = new User("Roxor", "Petey", "Smith");
        Account acc = new Account("767169286", 999999, user);

        process(acc);
    }

    public static void process(Account account) {
        try {
            final Optional<User> owner = Optional.ofNullable(account.getOwner());

            System.out.println("code "+ account.getCode());
            System.out.println("balace "+account.getBalance());

            owner.ifPresent(o -> {
                System.out.println("login"+o.getLogin());
                System.out.println("first name "+o.getFirstName());
                System.out.println("lastnane "+o.getLastName());
            });

        } catch (Exception e) {
            System.out.println("Something wrong...");
        }
    }
}