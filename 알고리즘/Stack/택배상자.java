import java.util.*;

class Solution {
    public int solution(int[] order) {
        int answer = 0;
        int n = 0;
        Stack<Integer> s = new Stack<>();
        
        for(int o : order) {
            while(o > n) {
                s.push(n++);
            }
            
            if(o == n) {
                answer++;
                n++;
            }else if(s.isEmpty() || s.pop() != o) {
                break;
            }else {
                answer++;
            }
        }
        
        return answer;
    }
}
