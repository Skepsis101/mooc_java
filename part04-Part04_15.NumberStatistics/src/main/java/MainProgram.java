
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        System.out.println("Enter numbers:");
        Scanner scanner = new Scanner(System.in);

        Statistics statistics = new Statistics();
        Statistics statistics2 = new Statistics();
        Statistics statistics3 = new Statistics();

        int input = 0;

        // some todos os numeros
        while (true) {
            input = Integer.valueOf(scanner.nextInt());
            if (input == -1) { // cheque se é -1 e saia do loop
                break;
            }
            statistics.addNumber(input); // se for diferente de -1, chame o método para adicionar fora do condicional

            // some os pares
            if (input % 2 == 0) {
                statistics2.addNumber(input);
            } else {
                // some os ímpares
                statistics3.addNumber(input);
            }
        }

        System.out.println("Count: " + statistics.getCount());
        System.out.println("Sum: " + statistics.sum());
        System.out.println("Average: " + statistics.average());
        System.out.println("Sum of even numbers: " + statistics2.sum());
        System.out.println("Sum of odd numbers: " + statistics3.sum());

    }
}
