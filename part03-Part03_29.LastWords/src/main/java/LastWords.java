
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();
            String[] split = input.split(" ");

            int i = split.length; // passa o tamanho da string para um índice
            System.out.println(split[i - 1]); // printe o último elemento da string

            if (input.equals("")) {
                break;
            }
        }
    }
}
