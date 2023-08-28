package exercise;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

// BEGIN
class App {
    public static boolean scrabble(String setOfLetters, String word) {

        if (setOfLetters.isEmpty() || word.isEmpty()) {
            return false;
        }

        String lowWord = word.toLowerCase();
        String lowLetters = setOfLetters.toLowerCase();

        List<String> lettersOfWord = new ArrayList<>(Arrays.asList(lowWord.split("")));
        List<String> letters = new ArrayList<>(Arrays.asList(lowLetters.split("")));

        for (String letter : lettersOfWord) {
            if (letters.contains(letter)) {
                letters.remove(letter);
            } else {
                return false;
            }
        }
        return true;
    }
}
//END
