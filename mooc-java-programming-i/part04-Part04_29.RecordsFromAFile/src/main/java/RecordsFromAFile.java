
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String file = scanner.nextLine();

        try (Scanner filesScanner = new Scanner(Paths.get(file))) {
            while (filesScanner.hasNextLine()) {
                String line = filesScanner.nextLine();

                String[] splitted = line.split(",");

                String name = splitted[0];
                int age = Integer.valueOf(splitted[1]);

                System.out.print(name + ", age: " + age);
                if (age > 1 || age == 0) {
                    System.out.println(" years");
                } else {
                    System.out.println(" year");
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
