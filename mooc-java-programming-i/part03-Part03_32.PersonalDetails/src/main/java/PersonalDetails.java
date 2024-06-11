
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        String longestName = "";
        int counter = 0;

        while (true) {
            String sentence = scanner.nextLine();

            if (sentence.isEmpty()) {
                break;
            }

            String[] splitted = sentence.split(",");
            String name = splitted[0];
            int age = Integer.valueOf(splitted[1]);

            sum = sum + age;

            if (longestName.length() < name.length()) {
                longestName = name;
            }

            counter = counter + 1;
        }
        double average = (double) sum / counter;
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + average);
    }
}
