
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container firstContainer = new Container();
        Container secondContainer = new Container();

        UserInterface userInterface = new UserInterface(firstContainer, secondContainer, scan);
        userInterface.start();
        
    }

}
