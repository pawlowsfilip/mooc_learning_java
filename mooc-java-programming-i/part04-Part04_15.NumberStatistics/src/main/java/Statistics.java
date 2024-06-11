public class Statistics {
    private int count = 0;
    private int sum = 0;

    public Statistics() {
    }

    public void addNumber(int number) {
        this.count = this.count + 1;
        this.sum =+ this.sum + number;
    }

    public int getCount() {
        return this.count;
    }

    public int sum() {
        return this.sum;
    }

    public double average() {
        double average = 0.0;
        if (this.count != 0) {
            return (double) this.sum / this.count;
        } else {
            return average;
        }
    }
}
