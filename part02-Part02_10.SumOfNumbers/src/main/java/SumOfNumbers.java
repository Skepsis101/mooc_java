
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        int soma = 0;

        while (true) {
            System.out.println("Give a number:");
            n = Integer.valueOf(scanner.nextLine());

            if (n != 0) {
                soma = soma + n;
                continue;
            } else {
                break;
            }
        }
        System.out.println("Sum of the numbers: " + soma);
    }
}
