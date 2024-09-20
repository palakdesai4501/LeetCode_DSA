package Arrays;
;
import java.util.Arrays;

public class isAnagram {
    public boolean isAnagramm(String s, String t) {
        char[] c1 = s.toCharArray();
        char[] c2 = t.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        return Arrays.equals(c1, c2);
    }
}
