import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        int tmax = 0;
        int tlen = tangerine.length;

        for(int i = 0; i < tlen; i++){
            tmax = Math.max(tmax, tangerine[i]);
        }
        
        int[] tCnt = new int[tmax + 1];
        for(int i = 0; i < tlen; i++){
            tCnt[tangerine[i]]++;
        }
        
        Arrays.sort(tCnt);
        
        for(int i = tmax; k > 0; i--){
            k -= tCnt[i];
            answer++;
        }
        
        return answer;
    }
}
