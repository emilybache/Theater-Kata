package codingdojo;


import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SeatFinderTest {

    @Test
    public void findTwoSeatsOnFrontRow() {
        Theater theater = ModelObjects.standardTheater();
        List<Seat> booked = Arrays.asList(new Seat("B2"), new Seat("B3"), new Seat("B4"), new Seat("B5"));
        SeatFinder seat_finder = new SeatFinder(theater, booked);
        assertEquals(Arrays.asList(new Seat("A5"), new Seat("A6")),
                     seat_finder.suggest(2));

    }

}