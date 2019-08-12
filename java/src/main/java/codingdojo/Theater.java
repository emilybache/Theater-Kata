package codingdojo;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;

/**
 * Read-only data about which rows and seats a particular theater has.
 */
public class Theater {

    public final List<Seat> seats = new ArrayList<Seat>();
    
    public Theater(Map<String, List<Integer>> seatData) {
        for (String row : seatData.keySet()) {
            for (Integer seatNumber :  seatData.get(row)) {
                seats.add(new Seat(row, seatNumber));
            }
        }
    }

    public List<Seat> getAvailableSeats() {
        return new ArrayList<Seat>(this.seats);
    }
}