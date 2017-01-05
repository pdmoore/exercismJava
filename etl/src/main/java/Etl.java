import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;

public class Etl {
    public Map<String, Integer> transform(Map<Integer, List<String>> old) {

        Map<String, Integer> values = new HashMap<String, Integer>();

        for (Integer pointValue : old.keySet()) {

            for (String singleLetter : old.get(pointValue)) {

                values.put(singleLetter.toLowerCase(), pointValue);
            }
        }

        return values;
    }
}
