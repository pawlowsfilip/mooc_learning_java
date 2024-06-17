
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            String numberString = scanner.nextLine();

            if (numberString.equals("end")) {
                break;
            }

            int numberInt = Integer.valueOf(numberString);

            System.out.println(numberInt*numberInt*numberInt);
            
        }
    }
}
