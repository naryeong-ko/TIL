import java.util.*;

class Solution {
    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder();

        for(int c : my_string.toCharArray()) {
            if(c >= 'a') {
                answer.append((char)(c - 32));
            } else {
                answer.append((char)(c + 32));
            }
        }

        return answer.toString();
    }
}
