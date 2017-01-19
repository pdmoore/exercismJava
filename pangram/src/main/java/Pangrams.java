import java.util.HashSet;
import java.util.Set;

/**
 * Created by pdm on 1/17/17.
 */
public class Pangrams {
    public static boolean isPangram(String sentence) {
        Set<Character> allLetters = new HashSet<Character>();

        char[] chars = sentence.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char thisChar = chars[i];
            if (isLetter(thisChar)) {
                allLetters.add(Character.toLowerCase(thisChar));
                if (sentenceContainsAllLetters(allLetters)) return true;
            }
        }

        return false;
    }

    private static boolean sentenceContainsAllLetters(Set<Character> allLetters) {
        return allLetters.size() == 26;
    }

    private static boolean isLetter(char thisChar) {
        return (thisChar >= 'a' && thisChar <= 'z') || (thisChar >= 'A' && thisChar <='Z');
    }
}
