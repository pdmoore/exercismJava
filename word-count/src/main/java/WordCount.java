import java.util.HashMap;
import java.util.Map;

public class WordCount {
    public Map<String,Integer> phrase(String word) {
        Map<String, Integer> result = new HashMap<>();
        result.put(word, 1);
        return result;
    }
}
