
import java.util.ArrayList;

import javax.swing.text.html.parser.Element;

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

    public String longest() {
        if (this.elements.isEmpty()) {
            return null;
        }

        String referenceString = this.elements.get(0);

        for (String element: elements) {
            if (element.length() > referenceString.length()) {
                referenceString = element;
            }
        }

        return referenceString;
    }

}
