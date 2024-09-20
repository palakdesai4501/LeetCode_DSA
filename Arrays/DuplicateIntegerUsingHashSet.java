package Arrays;

import java.util.HashSet;
import java.util.Set;

public class DuplicateIntegerUsingHashSet {
    public boolean hasDuplicate(int[] nums) {
        int n = nums.length;

        Set<Integer> st = new HashSet<>();

        for (int i = 0; i < n - 1; i++) {
            if (st.contains(nums[i])) {
                return true;
            } else {
                st.add(nums[i]);
            }

        }
        return false;

    }
}
