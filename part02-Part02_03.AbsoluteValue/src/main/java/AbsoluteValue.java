
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number:");
        int n = Integer.valueOf(scanner.nextLine());
        int a = 0;
        if (n < 0) {
            a = n * (-1);
            System.out.println(a);
        } else {
            System.out.println(n);
        }
    }
}
