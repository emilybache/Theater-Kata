package codingdojo;

import org.junit.*;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
 
 
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;
 
public class SeatFinderTest {
 
    @Test
    public void findTwoSeatsOnFrontRow() {
        Theater theater = Theater.standardTheater();
        List<Seat> booked = Arrays.asList(new Seat[]{
             new Seat("B2"), new Seat("B3"), new Seat("B4"), new Seat("B5")});
        SeatFinder seat_finder = new SeatFinder(theater, booked);
        assertEquals(Arrays.asList(new Seat[]{new Seat("A5"), new Seat("A6")}),
                     seat_finder.suggest(2));
 
    }
 
}