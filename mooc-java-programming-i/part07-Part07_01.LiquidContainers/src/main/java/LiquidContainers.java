
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstContainer = 0;
        int secondContainer = 0;
        int maxVolume = 100;

        while (true) {
            System.out.println("First: " + firstContainer + "/" + maxVolume);
            System.out.println("Second: " + secondContainer + "/" + maxVolume);

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] parts  = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            if (command.equals("add")) {
                if (amount > 0) {
                    if ((firstContainer + amount) > 100){
                        firstContainer = maxVolume;
                    } else {
                        firstContainer += amount;
                    }
                }
            }

            if (command.equals("move")) {
                if (firstContainer > 0 && amount > 0) {
                    if ((firstContainer - amount) >= 0) {
                        firstContainer = firstContainer - amount;
                        secondContainer = secondContainer + amount;
                        if (secondContainer > maxVolume) {
                            secondContainer = maxVolume;
                        }    
                    }

                    else if ((firstContainer - amount) < 0) {
                        secondContainer += firstContainer;
                        firstContainer = 0;
                        if (secondContainer > maxVolume) {
                            secondContainer = maxVolume;
                        }
                    }
                }
            }

            if (command.equals("remove")) {
                if (secondContainer > 0 && amount > 0) {
                    if ((secondContainer - amount) >= 0) {
                        secondContainer -= amount;
                    }
                }
            }
        }
    }
}
