import java.util.HashMap;
import java.util.Map;

//Task5
public class LetterFrequency {
    public static void main(String[] args) {
        String str = "To be or not to be";
        Map<Character, Integer> frequencyMap = calculateFrequency(str);
        System.out.println(frequencyMap);
    }

    private static Map<Character, Integer> calculateFrequency(String str) {
        Map<Character, Integer> frequencyMap = new HashMap<>();

        for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch)) {
                frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
            }
        }

        return frequencyMap;
    }
}