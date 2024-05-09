import java.util.*;

class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int plen = p.length();
        int tlen = t.length() - plen;
        
        for(int i = 0; i <= tlen; i++){
            boolean find = true;
            for(int j = 0; j < plen; j++) {
                int nowt = t.charAt(i + j) - '0';
                int nowp = p.charAt(j) - '0';
                
                if(nowt == nowp) {
                    continue;
                }
                
                if(nowt > nowp) {
                    find = false;
                    break;
                }
                
                break;
            }
            
            if(find) {
                answer++;
            }
        }
        
        return answer;
    }
}
