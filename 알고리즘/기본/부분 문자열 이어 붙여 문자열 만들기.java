import java.util.*;

class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        StringBuilder answer = new StringBuilder();

        int idx = 0;
        for(String str : my_strings) {
            answer.append(my_strings[idx].substring(parts[idx][0], parts[idx++][1] + 1));
        }


        return answer.toString();
    }
}
