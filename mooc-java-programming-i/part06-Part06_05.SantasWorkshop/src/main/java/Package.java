import java.util.ArrayList;

public class Package {
    private ArrayList<Gift> customPackage;

    public Package(){
        this.customPackage = new ArrayList<>();
    }

    public void addGift(Gift gift) {
        this.customPackage.add(gift);
    }

    public int totalWeight() {
        int totalSum = 0;
        for (Gift gift: customPackage) {
            totalSum = totalSum + gift.getWeight();
        }
        return totalSum;
    }

}
