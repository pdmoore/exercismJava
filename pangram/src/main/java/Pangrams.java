import java.util.HashSet;
import java.util.Set;

/**
 * Created by pdm on 1/17/17.
 */
public class Pangrams {
    public static boolean isPangram(String sentence) {
//        sentence = sentence.toLowerCase();
//
//        for (Character c = 'a'; c <= 'z'; c++) {
//            if (sentence.indexOf(c) == -1) {
//                return false;
//            }
//        }
//        return true;

        char[] chars = sentence.toCharArray();
        Set<Character> allLetters = new HashSet<Character>();
        for (int i = 0; i < chars.length; i++) {
            char thisChar = chars[i];
            if ((thisChar >= 'a' && thisChar <= 'z') || (thisChar >= 'A' && thisChar <='Z')) {
                allLetters.add(Character.toLowerCase(thisChar));
                if (allLetters.size() == 26) return true;
            }
        }

        return false;
    }
}
