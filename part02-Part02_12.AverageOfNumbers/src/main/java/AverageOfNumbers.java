
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number = 0;
        double amountOfNumbers = 0;
        double sumOfNumbers = 0;
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
