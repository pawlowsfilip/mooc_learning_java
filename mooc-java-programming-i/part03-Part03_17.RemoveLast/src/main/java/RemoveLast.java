
import java.util.ArrayList;

public class RemoveLast {

    public static void main(String[] args) {
        // Try your method in here
    }
    public static void removeLast(ArrayList<String> strings) {
        if (strings.size() == 0) {
            return;
        }

        int index = strings.size() - 1;
        String lastOne = "";

        for (int i = index; i >= 0; i--) {
            lastOne = strings.get(index);
        }
        
        strings.remove(lastOne);
    }
}
