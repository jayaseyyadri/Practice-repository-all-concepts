import java.util.HashMap;
import java.util.Map;

public class Sample {

    public static void main(String[] args) {
        String sentence = "where there is a will there is a way";
        Map<String, Integer> tracker= new HashMap<>();

        String[] words = sentence.split(" ");
        for (String word: words) {
            if(!tracker.containsKey(word)) {
                tracker.put(word, 1);
            }else {
                Integer wordCount = tracker.get(word);
                tracker.put(word, ++wordCount);
            }
        }
        System.out.println(tracker.get("there"));
    }
}
