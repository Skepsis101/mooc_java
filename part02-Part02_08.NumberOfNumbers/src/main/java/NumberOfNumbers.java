
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //inicializa variavel para contar n de inputs
        int inputs = 0;

        //read values until the user input a 0
        while (true) {
            System.out.println("Give a number:");
            int n = Integer.valueOf(scanner.nextLine());

            if (n != 0) {
                inputs ++;
                continue;
                
            } else {
                break;
            }

        }
        System.out.println("Number of numbers: " + inputs);
    }
}
