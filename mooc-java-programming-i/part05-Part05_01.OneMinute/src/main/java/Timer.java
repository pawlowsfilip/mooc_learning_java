public class Timer {
    private ClockHand seconds;
    private ClockHand hundreths;
    
    public Timer () {
        this.seconds = new ClockHand(60);
        this.hundreths = new ClockHand(100);
    }

    public void advance () {
        this.hundreths.advance();

        if (this.hundreths.value() == 0) {
            this.seconds.advance();
        }
    }

    public String toString() {
        return this.seconds + ":" + this.hundreths;
    }

}
