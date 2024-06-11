
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String sentence = scanner.nextLine();

            if (sentence.isEmpty()) {
                break;
            }

            String[] splitted = sentence.split(" ");

            for (int i = 0; i < splitted.length; i++) {
                if (splitted[i].contains("av")) {
                    System.out.println(splitted[i]);
                }
            }
        }

    }
}
