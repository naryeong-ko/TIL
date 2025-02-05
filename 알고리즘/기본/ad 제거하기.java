import java.util.*;

class Solution {
    public String[] solution(String[] strArr) {
        List<String> list = new ArrayList<>();

        for(String s : strArr) {
            if(!s.contains("ad")) {
                list.add(s);
            }
        }

        String[] answer = new String[list.size()];
        int idx = 0;
        for(String s : list) {
            answer[idx++] = s;
        }

        return answer;
    }
}
