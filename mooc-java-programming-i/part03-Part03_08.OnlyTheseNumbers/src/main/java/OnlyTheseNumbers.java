
import java.util.ArrayList;
import java.util.Scanner;

public class OnlyTheseNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {
                break;
            }

            numbers.add(number);
        }
        
        int start = Integer.valueOf(scanner.nextLine());

        int end = Integer.valueOf(scanner.nextLine());

        // loop through all list
        for (int i = start; i <= end; i++) {

                // print it
                System.out.println(numbers.get(i));
            
        }
    }
}
