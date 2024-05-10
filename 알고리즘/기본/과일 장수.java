import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        int slen = score.length;
        int start = slen % m;
        
        Arrays.sort(score);
        for(int i = start; i < slen; i += m) {
            answer += score[i] * m;
        }
        
        return answer;
    }
}
