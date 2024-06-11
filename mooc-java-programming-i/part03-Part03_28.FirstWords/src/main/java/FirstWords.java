
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String sentence = scanner.nextLine();

            if (sentence.isEmpty()) {
                break;
            }

            String[] splitted = sentence.split(" ");

            System.out.println(splitted[0]);
        }

    }
}
