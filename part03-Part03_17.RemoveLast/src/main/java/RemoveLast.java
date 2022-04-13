
import java.util.ArrayList;
import java.util.Scanner;

public class RemoveLast {

    public static void main(String[] args) {
        // Try your method in here

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> strings = new ArrayList<>();

        System.out.println("Enter strings: ");

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            strings.add(input);
        }
        removeLast(strings);
    }

    public static void removeLast(ArrayList<String> strings) {
        if (strings.isEmpty() == true) { // cheque se a lista está vazia e não faça nada
            System.out.println("List is empty.");
        } else { // remova o último item adicionado à lista
            strings.remove(strings.size() - 1);
            System.out.println(strings);
        }
    }
}
