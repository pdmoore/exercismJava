import org.omg.CORBA.INTERNAL;

import java.util.HashMap;
import java.util.Map;

public class DNA {
    private final String _dnaString;
    private Map<Character, Integer> _counts;

    public DNA(String dnaString) {
        _dnaString = dnaString;

        _counts = new HashMap<>();

        _counts.put('A', countOf('A'));
        _counts.put('C', countOf('C'));
        _counts.put('G', countOf('G'));
        _counts.put('T', countOf('T'));

    }

    private Integer countOf(char nucleotide) {
        int charMatched = 0;
        for (int i = 0; i < _dnaString.length(); i++) {
            if (_dnaString.charAt(i) == nucleotide) charMatched++;
        }
        return charMatched;
    }

    public Integer count(char nucleotide) {
        validateInput(nucleotide);
        return _counts.get(nucleotide);
    }

    public Map<Character, Integer> nucleotideCounts() {
        return _counts;
    }


    private void validateInput(char nucleotide) {
        String validNucleotides = "ACGT";
        if (validNucleotides.indexOf(nucleotide) == -1)
            throw new IllegalArgumentException(nucleotide + " is not a nucleotide");
    }
}
