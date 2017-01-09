import java.util.*;

public class WordCount {
    public Map<String,Integer> phrase(String sentence) {
        sentence = stripPunction(sentence);
        List<String> allWords = split(sentence);

        Map<String, Integer> words = new HashMap<>();
        for (String singleWord : allWords) {
            singleWord = singleWord.toLowerCase();
            if (singleWord.isEmpty()) { /* ignore */}
            else if (false == words.containsKey(singleWord)) {
                words.put(singleWord, 1);
            } else {
                Integer currentCount = words.get(singleWord);
                currentCount++;
                words.put(singleWord, currentCount);
            }
        }

        Map<String, Integer> result = new HashMap<>();
        for (String eachKey : words.keySet()) {
            result.put(eachKey, words.get(eachKey));
        }

        return result;
    }

    private String stripPunction(String sentence) {

        String s = sentence.replaceAll("[^a-zA-Z0-9\\s]", "");
        return s;
    }

    private List<String> split(String sentence) {
        String[] split = sentence.split("[^a-zA-Z0-9]");
        return Arrays.asList(split);
    }
}
