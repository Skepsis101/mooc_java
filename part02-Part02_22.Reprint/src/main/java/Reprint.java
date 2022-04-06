
import java.util.Scanner;

public class Reprint {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // ask the user for how many times should the text be printed
        System.out.println("How many times?");
        int t = 0;
        t = Integer.valueOf(scanner.nextLine());
        // then call the printText-method multiple times with a while-loop
        for (int i = 0; i < t; i++) {
            printText();
        }
    }

    // Don't change the next line that defines the method!
    // (We aren't giving a method a parameter yet)
    public static void printText() {
        // write some code here
        System.out.println("In a hole in the ground there lived a method");
    }
}
