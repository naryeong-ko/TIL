import java.util.*;

class Solution {
    public String solution(String myString) {
        StringBuilder answer = new StringBuilder();

        for(char c : myString.toCharArray()) {
            if(c <= 'l') {
                answer.append('l');
            } else {
                answer.append(c);
            }
        }

        return answer.toString();
    }
}
