import java.util.HashSet;
import java.util.Set;

/**
 * Created by pdm on 1/17/17.
 */
public class Pangrams {
    public static boolean isPangram(String sentence) {
        Set<Character> allLetters = new HashSet<Character>();

        sentence.chars()
                .mapToObj(i -> (char)i)
                .forEach(letter -> captureAllLetters(letter, allLetters));

        return sentenceContainsAllLetters(allLetters);
    }

    private static void captureAllLetters(char letter, Set<Character> allLetters) {
        if (isLetter(letter)) {
            allLetters.add(Character.toLowerCase(letter));
        }
    }

    private static boolean isLetter(char thisChar) {
        return (thisChar >= 'a' && thisChar <= 'z') || (thisChar >= 'A' && thisChar <='Z');
    }

    private static boolean sentenceContainsAllLetters(Set<Character> allLetters) {
        return allLetters.size() == 26;
    }
}
