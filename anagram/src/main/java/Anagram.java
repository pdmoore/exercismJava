import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Anagram {
    private final String _baseWordSorted;
    private final String _baseWord;

    public Anagram(String baseWord) {
        _baseWord = baseWord;
        _baseWordSorted = sortedStringOfLetters(baseWord.toLowerCase());
    }

    public List<String> match(List<String> possibleAnagrams) {

        List<String> verifiedAnagrams = possibleAnagrams.stream().
                filter(word -> !word.toLowerCase().equals(_baseWord.toLowerCase())).
                filter(word -> word.length() == _baseWordSorted.length()).
                filter(this::collectionOfLettersMatch).
                collect(Collectors.toList());

        return verifiedAnagrams;
    }

    private boolean collectionOfLettersMatch(String word) {
        return _baseWordSorted.equals(sortedStringOfLetters(word.toLowerCase()));
    }

    private String sortedStringOfLetters(String baseWord) {
        char[] chars = baseWord.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}
