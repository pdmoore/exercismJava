import java.util.*;

public class WordCount {
    public Map<String,Integer> phrase(String sentence) {
        Map<String, Integer> result = new HashMap<>();
        
        List<String> allWords = split(sentence);

        for ( String singleWord : allWords) {
            result.put(singleWord, 1);
                    }
                
        
        return result;
    }

    private List<String> split(String sentence) {
        String[] split = sentence.split(" ");
        return Arrays.asList(split);
    }
}
