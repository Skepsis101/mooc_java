
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float averageOfNumbers = 0;
        float amountOfNumbers = 0;
        float sumOfNumbers = 0;
        float numberOfNumbers = 0;
        float input = 0;

        while (true) {

            System.out.println("Give a number:");
            input = Integer.valueOf(scanner.nextLine());

            if (input == 0) {
                break;

            } else if (input > 0) {
                sumOfNumbers = sumOfNumbers + input;
                amountOfNumbers++;
                continue;
            }
        }

        averageOfNumbers = (sumOfNumbers / amountOfNumbers);

        if (amountOfNumbers != 0 && amountOfNumbers > 0) {
            System.out.println("Average of numbers: " + averageOfNumbers);

        } else {
            System.out.println("Cannot calculate the average");
        }
    }
}
