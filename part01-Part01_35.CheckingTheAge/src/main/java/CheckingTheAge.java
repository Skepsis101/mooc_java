
import java.rmi.StubNotFoundException;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

public class CheckingTheAge {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("How old are you?");
        int age = Integer.valueOf(scan.nextLine());

        if (age >= 0 && age <= 120){
            System.out.println("OK");
        } else {
            System.out.println("Impossible!");
        }
    }
}
