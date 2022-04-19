
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amountOfYears = 0;
        int sumOfTheYears = 0;
        int longestNameCont = 0;
        String longestNameString = "";

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            String[] split = input.split(",");

            // incremente a soma dos anos
            sumOfTheYears = sumOfTheYears + Integer.valueOf(split[1]);
            // incremente o contador de anos inseridos
            amountOfYears++;

        }

        System.out.println("Name of the oldest: ");
    }
}
