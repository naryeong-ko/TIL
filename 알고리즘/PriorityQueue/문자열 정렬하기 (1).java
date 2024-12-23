import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i = 0; i < my_string.length(); i++) {
            int now = my_string.charAt(i) - '0';

            if(now >= 0 && now <= 9) {
                pq.add(now);
            }
        }

        int len = pq.size();
        int[] answer = new int[len];

        for(int i = 0; i < len; i++) {
            answer[i] = pq.poll();
        }

        return answer;
    }
}
