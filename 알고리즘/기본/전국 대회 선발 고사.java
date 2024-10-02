import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> rank[a] - rank[b]);

        for(int i = 0; i < rank.length; i++) {
            if(attendance[i]) {
                pq.add(i);
            }
        }

        return 10000 * pq.poll() + 100 * pq.poll() + pq.poll();
    }
}
