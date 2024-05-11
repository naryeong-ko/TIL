import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int slen = score.length;
        int[] answer = new int[slen];
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int i = 0; i < slen && i < k; i++) {
            pq.add(score[i]);
            answer[i] = pq.peek();
        }
        
        for(int i = k; i < slen; i++) {
            pq.add(score[i]);
            pq.poll();
            answer[i] = pq.peek();
        }
        
        return answer;
    }
    
}
