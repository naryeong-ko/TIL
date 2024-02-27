import java.util.*;

class Solution {
    public int solution(String word) {
        int wlen = word.length();
        int answer = wlen; // A로만 이뤄져 있을 경우 최솟값
        
        for(int i = 0; i < wlen; i++) {
            char c = word.charAt(i);
            answer += num(c, 4 - i) * val(c);
        }
        
        return answer;
    }
    
    public int num(char c, int len) { // len은 자릿수
        if(c == 'A') {
            return 0;
        }
        
        int ret = 0;
        for(int j = 0; j <= len; j++) { // 자릿수에 맞춰서 계산 (5진법)
            ret += Math.pow(5, j);
        }
        
        return ret;
    }
    
    public int val(char c) {
        switch (c) {
        case 'E': return 1;
        case 'I' : return 2;
        case 'O': return 3;
        }
        
        return 4;
    }
}
