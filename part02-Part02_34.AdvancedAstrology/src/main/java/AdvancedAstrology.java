
public class AdvancedAstrology {

    public static void printStars(int number) {
        // first part of the exercise
        int numStar = 0;
        while (numStar < number) {
            System.out.print("*");
            numStar++;
        }
        System.out.println();
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        int numSpaces = 0;
        while (numSpaces < number) {
            System.out.print(" ");
            numSpaces++;
        }
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        int numSize = 0;
        while (size > 0) {
            printSpaces(--size);
            printStars(++numSize);
        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        int i = 1;
        int j = height - 1;

        while (i <= height) {
            printSpaces(j);
            printStars(i * 2 - 1);
            i++;
            j--;
        }

        printSpaces(height - 2);
        printStars(3);
        printSpaces(height - 2);
        printStars(3);
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
