
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Last number?");
        int lastNumber = Integer.valueOf(scanner.nextLine());

        int sumOfNumbers = 0;

        for (int i = 0; i <= lastNumber; i++) {
            sumOfNumbers = sumOfNumbers + i;
        }
        System.out.println("The sum is " + sumOfNumbers);
    }
}
