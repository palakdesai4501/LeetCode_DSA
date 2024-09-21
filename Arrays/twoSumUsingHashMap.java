package Arrays;

import java.util.HashMap;

public class twoSumUsingHashMap {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> h1 = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int diff = target - num;

            if (h1.containsKey(diff)) {
                return new int[] { h1.get(diff), i };
            }

            h1.put(num, i);
        }

        return new int[] {};

    }
}
