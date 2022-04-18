
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username1 = "alex";
        String password1 = "sunshine";
        String username2 = "emma";
        String password2 = "haskell";

        System.out.println("Enter username: ");
        String input = scanner.nextLine();
        System.out.println("Enter password: ");
        String password = scanner.nextLine();

        if (input.equals(username1) && password.equals(password1)) {
            System.out.println("You have successfully logged in!");
        } else if (input.equals(username2) && password.equals(password2)) {
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }
    }
}