package codingdojo;

public class Seat {

    public final String row;
    public final int seatNumber;

    public Seat(String row, int seatNumber) {
        this.row = row;
        this.seatNumber = seatNumber;
    }

    public Seat(String seatString) {
        this(seatString.substring(0, 1), Integer.parseInt(seatString.substring(1)));
    }

    public String toString() {
        return this.row + this.seatNumber;
    }


}