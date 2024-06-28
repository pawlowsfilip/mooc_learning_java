import java.util.Scanner;

public class UserInterface {
    private TodoList todoList;
    private Scanner scanner;

    public UserInterface(TodoList todoList, Scanner scanner) {
        this.todoList = todoList;
        this.scanner = scanner;
    }

    public void start() {
        while(true) {
            System.out.println("Command:");
            String command = scanner.nextLine();

            if (command.equals("stop")) {
                break;
            }

            else if (command.equals("add")) {
                add();
            }

            else if(command.equals("list")) {
                list();
            }
            
            else if(command.equals("remove")) {
                remove();
            }
        }
    }

    public void add() {
        System.out.println("To add:");
        String task = scanner.nextLine();
        this.todoList.add(task);
    }

    public void list() {
        this.todoList.print();
    }

    public void remove() {
        System.out.println("Which one is removed?");
        int removeTask = Integer.valueOf(scanner.nextLine());
        todoList.remove(removeTask);
    }
}
