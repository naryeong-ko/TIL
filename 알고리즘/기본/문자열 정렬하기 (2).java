import java.util.*;

class Solution {
    public String solution(String my_string) {
        char[] strs = my_string.toLowerCase().toCharArray();

        Arrays.sort(strs);

        return new String(strs);
    }
}
