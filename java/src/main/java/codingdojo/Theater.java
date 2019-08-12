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

}