
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = 0;
        int amountOfNumbers = 0;
        int sumOfNumbers = 0;
        double averageOfNumbers = 0;

        while (true) {
            System.out.println("Give a number:");
            number = Integer.valueOf(scanner.nextLine());

            if (number == 0) {
                break;
            } else {
                sumOfNumbers = sumOfNumbers + number;
                amountOfNumbers ++;
                continue;
            }
        }
        averageOfNumbers = (sumOfNumbers / amountOfNumbers);
        System.out.println("Average of the numbers: " + averageOfNumbers);
    }
}
