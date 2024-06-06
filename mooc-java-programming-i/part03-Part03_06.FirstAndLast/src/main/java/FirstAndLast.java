
import java.util.ArrayList;
import java.util.Scanner;

public class FirstAndLast {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            list.add(input);
        }

        int index = list.size() - 1;
        String lastOne = "";
        String firstOne = list.get(0);

        for (int i = index; i >= 0; i--) {
            lastOne = list.get(index);
        }
        System.out.println(firstOne);
        System.out.println(lastOne);
    }
}
