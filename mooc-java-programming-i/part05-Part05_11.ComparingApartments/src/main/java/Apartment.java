import java.lang.Math;

public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compared) {
        if (this.squares > compared.squares) {
            return true;
        }
        return false;
    }

    public int priceDifference(Apartment compared) {
        int ownPrice = this.squares * this.princePerSquare;
        int comparedPrice = compared.squares * compared.princePerSquare;
        int priceDifference = ownPrice - comparedPrice;

        return Math.abs(priceDifference);
    }

    public boolean moreExpensiveThan(Apartment compared) {
        if (this.princePerSquare > compared.princePerSquare) {
            return true;
        } else {
            return false;
        }
    }
     
}
