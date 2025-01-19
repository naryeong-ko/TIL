import java.util.*;

class Solution {
    public String solution(String rsp) {
        StringBuilder answer = new StringBuilder();
        int[] rsps = {5, 0, 0, 0, 0, 2};

        for(char a : rsp.toCharArray()) {
            answer.append(rsps[a - '0']);
        }

        return answer.toString();
    }
}
