
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GradeStatistics gradeStatistics = new GradeStatistics();
        UserInterface userInterface = new UserInterface(scanner, gradeStatistics);
        
        // Write your program here -- consider breaking the program into 
        // multiple classes.
        userInterface.start();

    }
}
