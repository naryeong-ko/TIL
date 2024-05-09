import java.util.*;

class Solution {
    public String solution(String s, String skip, int index) {
        StringBuilder answer = new StringBuilder();
        int sklen = skip.length();
        boolean[] skips = new boolean[26];
        for(int i = 0; i < sklen; i++){
            skips[skip.charAt(i) - 'a'] = true;
        }
        
        int slen = s.length();
        for(int i = 0; i < slen; i++){
            char now = s.charAt(i);
            
            int skipCnt = 0;
            for(int j = 1; j <= index; j++) {
                while(skips[(now - 'a' + j + skipCnt) % 26]) {
                    skipCnt++;
                }
            }
            
             answer.append((char)((now - 'a' + index + skipCnt) % 26 + 'a'));
        } 
        
        return answer.toString();
    }
}
