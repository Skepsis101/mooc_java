
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int negativeNumbers = 0;
        int n = 0;

        while (true) {
            System.out.println("Give a number:");
            n = Integer.valueOf(scanner.nextLine());

            //check if number is different from 0
            if (n != 0) {
                //check if number is negative and increment the counter
                if (n < 0) {
                    negativeNumbers ++;
                    continue;
                }
            } else {
                break;
            }
        }
        System.out.println("Number of negative numbers: " + negativeNumbers);
    }
}