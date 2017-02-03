import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Anagram {
    private final String _baseWord;

    public Anagram(String baseWord) {
        _baseWord = sortedStringOfLetters(baseWord);
    }

    public List<String> match(List<String> possibleAnagrams) {

        List<String> verifiedAnagrams = new ArrayList<>();

        for (String word : possibleAnagrams) {
            if (word.length() == _baseWord.length()) {
                if (collectionOfLettersMatch(word)) {
                    verifiedAnagrams.add(word);
                }
            }
        }
        
        return verifiedAnagrams;
    }

    private boolean collectionOfLettersMatch(String word) {
        return _baseWord.equals(sortedStringOfLetters(word));
    }

    private String sortedStringOfLetters(String baseWord) {
        char[] chars = baseWord.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}
