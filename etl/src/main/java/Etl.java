import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;

public class Etl {
    public Map<String, Integer> transform(Map<Integer, List<String>> old) {

        Set<Integer> keys = old.keySet();

        Map<String, Integer> values = new HashMap<String, Integer>();

        for (Integer key : keys) {
            List<String> mappedToKey = old.get(key);

            for (String singleLetter : mappedToKey) {

                values.put(singleLetter.toLowerCase(), key);
            }
        }


        return values;
    }
}
