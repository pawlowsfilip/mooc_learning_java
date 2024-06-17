
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> lines = new ArrayList<>();
        int counter = 0;

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());

        try (Scanner fileScanner = new Scanner(Paths.get(file))) {
            while (fileScanner.hasNextLine()) {
                int number = Integer.valueOf(fileScanner.nextLine());
                lines.add(number);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        for (Integer line: lines) {
            if (line <= upperBound && line >= lowerBound) {
                counter = counter + 1;
            }
        }

        System.out.println("Numbers: " + counter);
    }

}
