import java.util.ArrayList;

public class GradeStatistics {
    private ArrayList<Integer> points;
    private ArrayList<Integer> grades;

    public GradeStatistics() {
        this.points = new ArrayList<>();
        this.grades = new ArrayList<>();

    }

    public void addPoints(int points) {
        if (points >= 0 && points <= 100){
            this.points.add(points);
            this.grades.add(pointsToGrade(points));
        }
    }

    public double averageOfPoints() {
        int totalPoints = 0;
        int pointsLength = this.points.size();

        if (pointsLength == 0) {
            return 0.0;
        }
        
        for (int number: this.points) {
            totalPoints += number;
        }

        return (double) totalPoints / pointsLength;
    }

    public double averageOfPointsPassing() {
        int totalPointsPassing = 0;
        int pointsPassingLength = 0;
        
        for (int number: this.points) {
            if (number >= 50) {
                totalPointsPassing += number;
                pointsPassingLength++;
            }
        }

        if (pointsPassingLength == 0) {
            return 0.0;
        }
        
        return (double) totalPointsPassing / pointsPassingLength;
    }

    public double passPercentage() {
        int passing = 0;
        int participants = this.points.size();;

        for (int number: this.points) {
            if (number >= 50) {
                passing++;
            }
        }
        
        return 100 * (double) passing / participants;
    }

    public static int pointsToGrade(int points) {
        int grade = 0;

        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }
        return grade;
    }

    public int totalGrades(int wantedGrade) {
        int total = 0;

        for (int grade: grades) {
            if (grade == wantedGrade) {
                total++;
            }
        }
        return total;
    }
}
