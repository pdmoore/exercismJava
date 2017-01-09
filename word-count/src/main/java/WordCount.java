import java.util.*;

public class WordCount {
    public Map<String,Integer> phrase(String sentence) {
        List<String> allWords = split(sentence);

        Map<String, Integer> words = new HashMap<>();
        for (String singleWord : allWords) {
            singleWord = singleWord.toLowerCase();
            if (false == words.containsKey(singleWord)) {
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

    private List<String> split(String sentence) {
        String[] split = sentence.split(" ");
        return Arrays.asList(split);
    }
}
