import java.util.Scanner;

public class Division {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Once you have implemented the division method, you can
        // try it out here. Fopr example division(3,5);
        // should print "0.6"
        System.out.println("Give two numbers:");
        int a = Integer.valueOf(scanner.nextInt());
        int b = Integer.valueOf(scanner.nextInt());

        // division(3, 5);
        division(a, b);
    }

    // implement the method here
    public static void division(int numerator, int denominator) {
        float result = (float) numerator / (float) denominator;
        System.out.println(result);
    }
}
