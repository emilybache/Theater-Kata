package codingdojo;

import java.util.List;
import java.util.Map;

public class TheaterFactory {
    public static Theater newTheater(Map<String, List<Integer>> seats) {
        return new Theater(seats);
    }
}
