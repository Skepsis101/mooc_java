import java.util.Scanner;

public class StarSign {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // print the stars
        System.out.println("Give a number of stars:");
        int stars = Integer.valueOf(scanner.nextLine());
        printStars(stars);

        // print a square os size height
        System.out.println("Give the height of the square:");
        int size = Integer.valueOf(scanner.nextLine());
        printSquare(size);

        System.out.println("Give the width of the rectangle:");
        int width = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the height of the rectangle:");
        int height = Integer.valueOf(scanner.nextLine());
        printRectangle(width, height);

        System.out.println("Give the height of the triangle:");
        int triangleSize = Integer.valueOf(scanner.nextLine());
        printTriangle(triangleSize);

    }

    public static void printStars(int stars) {
        // first part of the exercise
        int i = 0;
        while (i < stars) {
            System.out.print('*');
            i++;
        }
        System.out.println("");
    }

    public static void printSquare(int size) {
        // second part of the exercise
        int i = 0;
        while (i < size) {
            printStars(size);
            i++;
        }
    }

    public static void printRectangle(int width, int height) {
        // third part of the exercise
        for (int counter = 1; counter <= width; counter++) {
            printStars(width); // uma linha de estrelas como width
            if (counter == height) { // usar o metodo height vezes
                break;
            }
        }
    }

    public static void printTriangle(int size) {
        // fourth part of the exercise
        for (int i = 1; i <= size; i++) {
            printStars(i);
        }
    }
}