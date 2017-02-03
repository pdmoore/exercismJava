import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Anagram {
    private final String _baseWord;

    public Anagram(String baseWord) {
        char[] chars = baseWord.toCharArray();
        Arrays.sort(chars);
        _baseWord = new String(chars);
    }

    public List<String> match(List<String> possibleAnagrams) {

        List<String> verifiedAnagrams = new ArrayList<>();

        for (String word :
                possibleAnagrams) {
            if (word.length() == _baseWord.length()) {
                if (collectionOfLettersMatch(word)) {
                    verifiedAnagrams.add(word);
                }
            }
        }


        return verifiedAnagrams;
    }

    private boolean collectionOfLettersMatch(String word) {

        char[] chars = word.toCharArray();
        Arrays.sort(chars);
        String newWord = new String(chars);

        return _baseWord.equals(newWord);
    }
}
