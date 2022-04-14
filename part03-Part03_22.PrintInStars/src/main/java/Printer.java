
public class Printer {

    public static void main(String[] args) {
        // You can test the method here
        int[] array = { 5, 1, 3, 4, 2 };
        printArrayInStars(array);
    }

    public static void printArrayInStars(int[] array) {
        // Write some code in here
        // percorra o array
        for (int i = 0; i < array.length; i++) {
            int numberOfStars = 1;
            // quebra linha cada vez que o array é percorrido
            System.out.println("");

            // para cada elemento do array, printe o numero de estrelas correspondente ao
            // valor presente naquela posição
            while (numberOfStars <= array[i]) {
                System.out.print("*");
                numberOfStars++;
            }

        }

    }

}