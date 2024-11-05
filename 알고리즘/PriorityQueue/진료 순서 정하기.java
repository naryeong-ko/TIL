import java.util.*;

class Solution {
    class EmNum {
        int i;
        int e;

        public EmNum(int i, int e) {
            this.i = i;
            this.e = e;
        }
    }

    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        PriorityQueue<EmNum> pq = new PriorityQueue<>((o1, o2) -> o2.e - o1.e);

        for(int i = 0; i < emergency.length; i++) {
            pq.add(new EmNum(i, emergency[i]));
        }

        for(int i = 1; i <= emergency.length; i++) {
            answer[pq.poll().i] = i;
        }

        return answer;
    }
}
