package Arrays;

import java.util.HashMap;

public class isAnagramUsingHashing {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> charCount = new HashMap<>();

        for (char c : s.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        for (char c : t.toCharArray()) {
            if (!charCount.containsKey(c) || charCount.get(c) == 0) {
                return false;
            }

            charCount.put(c, charCount.get(c) - 1);
        }

        for (int count : charCount.values()) {
            if (count != 0) {
                return false;
            }
        }
        return false;
    }
}
