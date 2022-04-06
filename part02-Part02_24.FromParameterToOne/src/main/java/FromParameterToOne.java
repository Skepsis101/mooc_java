import java.util.Scanner;

import javax.print.attribute.standard.PrinterMoreInfoManufacturer;

public class FromParameterToOne {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.valueOf(scanner.nextLine());
        printFromNumberToOne(number);
    }

    // define the method
    public static void printFromNumberToOne(int number) {
        while (number >= 1) {
            System.out.println(number);
            number--;
        }
    }
}