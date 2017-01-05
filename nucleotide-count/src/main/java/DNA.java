import org.omg.CORBA.INTERNAL;

import java.util.HashMap;
import java.util.Map;

public class DNA {
    public DNA(String dnaString) {
    }

    public Integer count(char a) {
        return new Integer(0);
    }

    public Map<Character,Integer> nucleotideCounts() {

        Map<Character, Integer> counts = new HashMap<>();

        counts.put('A', 0);
        counts.put('C', 0);
        counts.put('G', 0);
        counts.put('T', 0);

        return counts;
    }
}
