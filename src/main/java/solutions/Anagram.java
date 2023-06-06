package solutions;

import java.util.HashMap;
import java.util.Map;

public class Anagram {
    public static boolean isAnagram(String s, String t) {
        if (countCharacters(s) == countCharacters(t) &&
                countCharactersRepeats(s).equals(countCharactersRepeats(t))) {
            return true;
        }
        return false;
    }

    public static Map<Character, Integer> countCharactersRepeats(String inputString) {
        Map<Character, Integer> charsMap = new HashMap<>();
        for (char ch : inputString.toCharArray()) {
            if (Character.isLetter(ch)) {
                ch = Character.toLowerCase(ch);
                charsMap.put(ch, charsMap.getOrDefault(ch, 0) + 1);
            }
        }
        return charsMap;
    }

    public static int countCharacters(String input) {
        int charCount = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isLetter(ch)) {
                charCount++;
            }
        }
        return charCount;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("sdaf  12", "asdf5435"));
    }
}
