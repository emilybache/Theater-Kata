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

    public final List<String> rows;
    public final Map<String, List<Integer>> seats;
    
    public Theater(List<String> rows, Map<String, List<Integer>> seats) {
        this.rows = rows;
        this.seats = seats;
    }

    /**
     * Factory method to create a standard theater with 7 rows of 10 seats each
     */
    public static Theater standardTheater() {
        List<String> rows = Arrays.asList(
            new String[]{"A", "B", "C", "D", "E", "F", "G"});
        Map<String, List<Integer>> seats = new HashMap();
        seats.put("A", Arrays.asList(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
        seats.put("B", Arrays.asList(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
        seats.put("C", Arrays.asList(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
        seats.put("D", Arrays.asList(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
        seats.put("E", Arrays.asList(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
        seats.put("F", Arrays.asList(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
        seats.put("G", Arrays.asList(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
        return new Theater(rows, seats);
    }

}