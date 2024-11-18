import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> list = new ArrayList<>();

        for(String is : intStrs) {
            int now = Integer.parseInt(is.substring(s, s + l));
            if(now > k) {
                list.add(now);
            }
        }

        int[] answer = new int[list.size()];

        for(int i  = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
