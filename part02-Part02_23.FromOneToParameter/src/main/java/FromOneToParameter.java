import java.util.Scanner;

public class FromOneToParameter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("From one to?");
        int number = Integer.valueOf(scanner.nextLine());
        printUntilNumber(number);
    }

    public static void printUntilNumber(int number) {
        int count = 1;
        while (count <= number) {
            System.out.println(count);
            count++;
        }
    }
}
