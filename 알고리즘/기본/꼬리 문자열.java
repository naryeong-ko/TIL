import java.util.*;

class Solution {
    public String solution(String[] str_list, String ex) {
        StringBuilder answer = new StringBuilder();

        for(String l : str_list) {
            if(!l.contains(ex)) {
                answer.append(l);
            }
        }

        return answer.toString();
    }
}
