import java.util.Scanner;

public class UserInterface {
    private Container firstContainer;
    private Container secondContainer;
    private Scanner scanner;

    public UserInterface(Container firstContainer, Container secondContainer, Scanner scanner) {
        this.firstContainer = firstContainer;
        this.secondContainer = secondContainer;
        this.scanner = scanner;
    }

    public void start() {
        while(true) {

            System.out.println("First: " + this.firstContainer);
            System.out.println("Second: " + this.secondContainer);


            String input = scanner.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] parts  = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            if (command.equals("add")) {
                this.firstContainer.add(amount);
            }

            else if (command.equals("move")) {
                if (this.firstContainer.contains() - amount >= 0) {
                    this.firstContainer.remove(amount);
                    this.secondContainer.add(amount);
                } else {
                    int bufferAmount = this.firstContainer.contains();
                    this.firstContainer.remove(bufferAmount);
                    this.secondContainer.add(bufferAmount);
                }
            }

            if (command.equals("remove")) {
                this.secondContainer.remove(amount);
            }
        }
    }
}
