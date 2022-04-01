
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        
        Scanner scanner = new Scanner(System.in);

        float n = 0;
        int sum = 0;
        int amount = 0;
        int even = 0;
        int odd = 0;

        while (true) {
            System.out.println("Give numbers:");
            n = scanner.nextFloat();

            //ask the user numbers until he inputs -1
            if (n == -1) {
                System.out.println("Thx! Bye!");
                break;

            //increment the amount and sum of the numbers and check the evens and odds
            } else {
                if (n % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
                sum += n;
                amount++;
                continue;
            }
        }

        float average = ((float)sum / (float)amount);
        
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + amount);
        System.out.println("Average: " + average);
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}