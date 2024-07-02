import java.util.Scanner;


public class UserInterface {
    private Scanner scanner;
    private GradeStatistics gradeStatistics;

    public UserInterface(Scanner scanner, GradeStatistics gradeStatistics) {
        this.scanner = scanner;
        this.gradeStatistics = gradeStatistics;
    }

    public void start() {
        System.out.println("Enter point totals, -1 stops:");

        while (true) {
            Integer input = Integer.valueOf(scanner.nextLine());

            if(input == -1) {
                break;
            }

            gradeStatistics.addPoints(input);
        }

        System.out.println("Point average (all): " + gradeStatistics.averageOfPoints());
        
        if (gradeStatistics.averageOfPointsPassing() == 0.0) {
            System.out.println("Point average (passing): -");
        } else {
            System.out.println("Point average (passing):" + gradeStatistics.averageOfPointsPassing());
        }
        System.out.println("Pass percentage:" + gradeStatistics.passPercentage());
        System.out.println("Grade distribution:");
        gradeDistribution();
    }

    public void gradeDistribution() {
        int maxGrade = 5;

        while (maxGrade >= 0) {
            int starsNumber = gradeStatistics.totalGrades(maxGrade);
            System.out.print(maxGrade + ": ");
            gradeToStars(starsNumber);
            System.out.println("");
            maxGrade--;
        }
    }

    public void gradeToStars(int starsNumber) {
        while (starsNumber > 0) {
            System.out.print("*");
            starsNumber--;
        }
    }
}
