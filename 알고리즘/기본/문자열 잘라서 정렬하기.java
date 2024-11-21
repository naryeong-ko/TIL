import java.util.*;

class Solution {
    public String[] solution(String myString) {
        String[] str = myString.split("x");
        Arrays.sort(str);

        int idx = 0;
        while(idx < str.length && str[idx].equals("")) {
            idx++;
        }

        if(idx == 0) {
            return str;
        }

        String[] answer = new String[str.length - idx];
        for(int i = 0; idx < str.length;) {
            answer[i++] = str[idx++];
        }

        return answer;
    }
}
