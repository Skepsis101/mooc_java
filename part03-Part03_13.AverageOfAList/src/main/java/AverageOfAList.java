
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program, that first reads user input
        ArrayList<Integer> numbers = new ArrayList<>();

        while (true) {
            int input = Integer.valueOf(scanner.nextInt());
            if (input == -1) {
                break;
            }

            numbers.add(input);
        }

        System.out.println("");

        float averageOfNumbers = 0;
        int sumOfNumbers = 0;
        int numberOfNumbers = 0;
        for (int number : numbers) {
            sumOfNumbers = number + sumOfNumbers;
            numberOfNumbers++;
        }

        averageOfNumbers = (float) sumOfNumbers / (float) numberOfNumbers;

        System.out.println("Average: " + averageOfNumbers);

        // adding them on a list until user gives -1.
        // Then it computes the average of the numbers on the list
        // and prints it.

    }
}
