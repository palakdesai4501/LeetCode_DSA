package Arrays;

import java.util.*;

public class groupAnagram {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();

        HashMap<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            char[] chArr = str.toCharArray();
            Arrays.sort(chArr);
            String key = new String(chArr);

            if (map.containsKey(key)) {
                map.get(key).add(str);
            } else {
                List<String> strList = new ArrayList<>();
                strList.add(str);
                map.put(key, strList);
            }
        }
        result.addAll(map.values());
        return result;
    }
}
