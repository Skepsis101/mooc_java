
import java.util.Scanner;

public class Squared {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number:");
        int n =  Integer.valueOf(scanner.nextLine());

        System.out.println(n * n);
    }
}
