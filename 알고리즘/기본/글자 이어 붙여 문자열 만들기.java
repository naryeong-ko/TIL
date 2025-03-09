import java.util.*;

class Solution {
    public String solution(String my_string, int[] index_list) {
        StringBuilder answer = new StringBuilder();

        for(int i : index_list) {
            answer.append(my_string.charAt(i));
        }

        return answer.toString();
    }
}
