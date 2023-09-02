package exercise;

import java.util.HashMap;
import java.util.Map;

// BEGIN
public class App {
    public static Map<String, Integer> getWordCount(String sentence) {
        Map<String, Integer> wordsQuantity = new HashMap<>();
        String[] wordsFromSentence = sentence.split(" ");
        if (!sentence.isEmpty()) {
            for (String word : wordsFromSentence) {
                int wordsCounter = wordsQuantity.getOrDefault(word, 0);
                wordsCounter++;
                wordsQuantity.put(word, wordsCounter);
            }
        }
        return wordsQuantity;
    }
    public static String toString(Map<String, Integer> wordsQuantity) {
        if (wordsQuantity.isEmpty()) {
            return "{}";
        }
        String result = "{" + "\n";
        for (String key : wordsQuantity.keySet()) {
            result += "  " + key + ":" + " " + wordsQuantity.get(key) + "\n";
        }
        result += "}";
        return result;
    }
}
//END
