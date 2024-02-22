import java.util.*;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        int clen = citations.length;
        
        Arrays.sort(citations);

        for(int i = clen - 1; i >= 0 && (citations[i] >= clen - i); i--){
            answer = clen - i;
        }
        
        return answer;
    }
}
