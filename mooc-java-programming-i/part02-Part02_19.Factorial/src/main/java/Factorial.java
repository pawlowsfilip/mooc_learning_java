
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // take the number
        System.out.println("Give a number: ");
        int number = Integer.valueOf(scanner.nextLine());

        // declare a sum
        int sum = 1;

        // start is 1, add till the counter will be number provided by user
        for (int i = 1; i <= number; i++) {
            sum = sum * i;
        }

        System.out.println("Factorial: " + sum);
    }
}
