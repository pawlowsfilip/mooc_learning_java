
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest = 0;
        String oldestName = "";

        while(true) {
            String sentence = scanner.nextLine();
            
            if (sentence.isEmpty()) {
                break;
            }

            String[] splitted = sentence.split(",");
            int age = Integer.valueOf(splitted[1]);
            String name = splitted[0];

            if (oldest < age) {
                oldest = age;
                oldestName = name;
            }
        }

        System.out.println("Name of the oldest: " + oldestName);

    }
}
