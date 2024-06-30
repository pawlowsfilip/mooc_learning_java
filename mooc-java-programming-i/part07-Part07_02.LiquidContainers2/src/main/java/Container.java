public class Container {
    private int totalAmount;

    public Container () {
        this.totalAmount = 0;
    }

    public int contains() {
        return this.totalAmount;
    }

    public void add(int amount) {
        if (amount > 0) {
            if ((this.totalAmount + amount) > 100){
                this.totalAmount = 100;
            } else {
                this.totalAmount += amount;
            }
        }
    }

    public void remove(int amount) {
        if (this.totalAmount > 0 && amount > 0) {
            if ((this.totalAmount - amount) >= 0) {
                this.totalAmount -= amount;
            } else {
                this.totalAmount = 0;
            }
        }
    }

    public String toString() {
        return this.totalAmount + "/100";
    }
}
