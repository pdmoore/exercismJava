import java.util.HashMap;
import java.util.Map;

public class DNA {
    public static final char ADENINE = 'A';
    public static final char CYTOSINE = 'C';
    public static final char GUANINE = 'G';
    public static final char THYMINE = 'T';

    private final String _dnaString;
    private Map<Character, Integer> _counts;

    public DNA(String dnaString) {
        _dnaString = dnaString;

        _counts = new HashMap<>();

        _counts.put(ADENINE, countOf(ADENINE));
        _counts.put(CYTOSINE, countOf(CYTOSINE));
        _counts.put(GUANINE, countOf(GUANINE));
        _counts.put(THYMINE, countOf(THYMINE));
    }

    public Integer count(char nucleotide) {
        validateInput(nucleotide);
        return _counts.get(nucleotide);
    }

    public Map<Character, Integer> nucleotideCounts() {
        return _counts;
    }

    private Integer countOf(char nucleotide) {
        return _dnaString.length() - _dnaString.replace(Character.toString(nucleotide), "").length();
    }

    private void validateInput(char nucleotide) {
        String validNucleotides = "" + ADENINE + CYTOSINE + GUANINE + THYMINE;
        if (validNucleotides.indexOf(nucleotide) == -1)
            throw new IllegalArgumentException(nucleotide + " is not a nucleotide");
    }
}
