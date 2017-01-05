import org.omg.CORBA.INTERNAL;

import java.util.HashMap;
import java.util.Map;

public class DNA {
    private final String _dnaString;
    private Map<Character, Integer> _counts;

    public DNA(String dnaString) {
        _dnaString = dnaString;

        _counts = new HashMap<>();

        _counts.put('A', 0);
        _counts.put('C', _dnaString.length());
        _counts.put('G', 0);
        _counts.put('T', 0);

    }

    public Integer count(char a) {
        return _counts.get(a);
    }

    public Map<Character, Integer> nucleotideCounts() {
        return _counts;
    }
}
