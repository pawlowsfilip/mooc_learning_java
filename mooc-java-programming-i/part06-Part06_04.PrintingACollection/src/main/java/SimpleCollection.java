
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String toString() {
        String outputString = "The collection " + this.name;
        
        if (this.elements.isEmpty()) {
            return outputString + " is empty.";
        }

        if (this.elements.size() == 1) {
            String oneString = "";

            for (String element: elements) {
                oneString = oneString + element;
            }

            outputString = outputString + " has " + elements.size() + " element:\n" + oneString;
        }

        if (this.elements.size() > 1) {
            String oneString = "";

            for (String element: elements) {
                oneString = oneString + element + "\n";
            }

            outputString = outputString + " has " + elements.size() + " elements:\n" + oneString;
        }

        return outputString;
    }
    
}
