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
        _counts.put('C', countOf('C'));
        _counts.put('G', countOf('G'));
        _counts.put('T', 0);

    }

    private Integer countOf(char c) {
        int charMatched = 0;
        for (int i = 0; i < _dnaString.length(); i++) {
            if (_dnaString.charAt(i) == c) charMatched++;
        }
        return charMatched;
    }

    public Integer count(char a) {
        return _counts.get(a);
    }

    public Map<Character, Integer> nucleotideCounts() {
        return _counts;
    }
}
