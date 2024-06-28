import java.util.ArrayList;

public class Hold {
    private int maximumWeight;
    private ArrayList<Suitcase> hold;

    public Hold(int maximumWeight) {
        this.hold = new ArrayList<>();
        this.maximumWeight = maximumWeight;
    }

    public void addSuitcase(Suitcase suitcase) {
        int weightWithNewSuitcase = totalWeight() + suitcase.totalWeight();

        if (!(weightWithNewSuitcase > this.maximumWeight)) {
            this.hold.add(suitcase);
        }
    }

    public int totalWeight() {
        int totalWeight = 0;

        for (Suitcase suitcase: hold) {
            totalWeight += suitcase.totalWeight();
        }

        return totalWeight;
    }

    public void printItems() {
        for (Suitcase suitcase: hold) {
            suitcase.printItems();
        }
    }

    public String toString() {
        return this.hold.size() + " suitcases (" + totalWeight() + " kg)";
    }
}
