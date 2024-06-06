
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        int counter = 0;

        while (true) {
            System.out.println("Give a number:");
            
            int number = Integer.valueOf(scanner.nextLine());
            
            if (number == 0) {
                break;
            }
            
            if (number > 0 ){
                sum = sum + number;
                counter = counter + 1;
            }

        }
        
        if (sum == 0) {
            System.out.println("Cannot calculate the average");
        }

        double average = sum / counter;
        System.out.println("Average of the numbers: " + average);
    }
}
