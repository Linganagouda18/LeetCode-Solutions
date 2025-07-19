import java.util.*;

class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        char[] pat = pattern.toCharArray();

        // Check lengths
        if (words.length != pat.length) return false;

        HashMap<Character, String> map = new HashMap<>();
        HashSet<String> usedWords = new HashSet<>();

        for (int i = 0; i < pat.length; i++) {
            char c = pat[i];
            String word = words[i];

            if (map.containsKey(c)) {
                if (!map.get(c).equals(word)) return false;
            } else {
                if (usedWords.contains(word)) return false; // Word already mapped to a different character
                map.put(c, word);
                usedWords.add(word);
            }
        }

        return true;
    }
}
