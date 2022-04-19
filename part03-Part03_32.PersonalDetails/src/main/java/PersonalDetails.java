
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        int amountOfYears = 0;
        int sumOfYears = 0;
        String longestName = "";
        float averageOfYears = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            String[] split = input.split(",");

            // incremente a soma dos anos
            sumOfYears = sumOfYears + Integer.valueOf(split[1]);
            // incremente o contador de anos inseridos
            amountOfYears++;

            // verifique e atualize o maior nome
            if (longestName.length() < split[0].length()) {
                longestName = split[0];
            }

        }
        // calcule a média dos anos
        averageOfYears = (float) sumOfYears / (float) amountOfYears;

        // exiba as informações
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + averageOfYears);

    }
}
