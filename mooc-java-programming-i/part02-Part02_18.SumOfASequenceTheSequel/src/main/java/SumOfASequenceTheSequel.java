
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // take the start
        System.out.println("First number? ");
        int start = Integer.valueOf(scanner.nextLine());

        // take the end
        System.out.println("Last number? ");
        int end = Integer.valueOf(scanner.nextLine());

        // declare a sum
        int sum = 0;

        // start is 1, add till the counter will be number provided by user
        for (int i = start; i <= end; i++) {
            sum = sum + i;
        }

        // print the result
        System.out.println("The sum is " + sum);
    }
}
