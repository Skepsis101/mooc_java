
import java.util.ArrayList;
import java.util.Scanner;

public class PrintInRange {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> listaNumeros = new ArrayList<>();

        System.out.println("Enter numbers: ");
        // Try your method here
        while (true) {
            int input = scanner.nextInt();
            if (input == -1) {
                break;
            }

            listaNumeros.add(input);
        }

        System.out.println("Enter lower limit: ");
        int lowerLimit = scanner.nextInt();

        System.out.println("Enter upper limit: ");
        int upperLimit = scanner.nextInt();

        // chama o método para printar os números
        printNumbersInRange(listaNumeros, lowerLimit, upperLimit);

    }

    // declare o método para printar numeros dentro de um certo limite
    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit) {
        // emita a mensagem antes do loop
        System.out.println("The numbers in the range [" + lowerLimit + ", " + upperLimit + "]");

        // para cada elemento na lista numbers
        for (int number : numbers) {
            // verifique se o numero se encontra entre o limite e printe o numero
            if (number >= lowerLimit && number <= upperLimit) {
                System.out.println(number);
            }
        }
    }
}
