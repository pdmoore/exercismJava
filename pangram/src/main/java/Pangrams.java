/**
 * Created by pdm on 1/17/17.
 */
public class Pangrams {
    public static boolean isPangram(String sentence) {
        for (Character c = 'a'; c <= 'z'; c++) {
            if (sentence.indexOf(c) == -1) {
                return false;
            }
        }
        return true;
    }
}
