
import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here 
        System.out.println("Give a number:");
        int n = Integer.valueOf(scan.nextLine());

        if (n % 2 == 0) {
            System.out.println("is even!");
        } else {
            System.out.println("is odd!");
        }
    }
}
