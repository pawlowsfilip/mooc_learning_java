import java.util.ArrayList;
import java.util.Scanner;

public class TodoList {
    private ArrayList<String> todoList;

    public TodoList() {
        this.todoList = new ArrayList<>();
    }

    public void add(String task) {
        this.todoList.add(task);
    }

    public void print() {
        int taskIndex = 1;

        for (String task: todoList) {
            System.out.println(taskIndex + ": " + task);
            taskIndex++;
        }
    }

    public void remove(int number) {
        todoList.remove(todoList.get(number - 1));
    }
}
