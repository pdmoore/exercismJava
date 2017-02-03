import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Anagram {
    private final String _baseWord;

    public Anagram(String baseWord) {
        _baseWord = baseWord;
    }

    public List<String> match(List<String> possibleAnagrams) {

        List<String> verifiedAnagrams = new ArrayList<>();

        for (String word :
                possibleAnagrams) {
            if (word.length() == _baseWord.length()) {
                verifiedAnagrams.add(word);
            }
        }


        return verifiedAnagrams;
    }
}
