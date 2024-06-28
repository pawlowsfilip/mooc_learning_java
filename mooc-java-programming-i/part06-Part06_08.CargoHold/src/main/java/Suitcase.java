import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> items;
    private int maxWeight;

    public Suitcase(int maxWeight) {
        this.items = new ArrayList<>();
        this.maxWeight = maxWeight;
    }

    public void addItem(Item item) {
        int weightWithNewItem = totalWeight() + item.getWeight();

        if(!(weightWithNewItem > maxWeight)) {
            this.items.add(item);
        }
    }

    public int totalWeight() {
        int totalWeight = 0;

        for (Item item: items) {
            totalWeight += item.getWeight();
        }

        return totalWeight;
    }

    public String toString() {
        String finalString = "";

        if (items.size() == 0) {
            finalString = "no items (" + totalWeight() +" kg)";
        }

        if (items.size() == 1) {
            finalString = "1 item (" + totalWeight() + "kg)";
        }

        if (items.size() > 1) {
            finalString = this.items.size() + " items (" + totalWeight() + " kg)";
        }

        return finalString;
    }

    public void printItems() {
        for (Item item: items) {
            System.out.println(item);
        }
    }

    public Item heaviestItem() {
        if (this.items.isEmpty()) {
            return null;
        }

        Item referenceItem = this.items.get(0);

        for (Item item: items) {
            if (referenceItem.getWeight() < item.getWeight()) {
                referenceItem = item;
            }
        }

        return referenceItem;
    }

}
