import java.util.*;

class Solution {
    public String solution(String number, int k) {
        StringBuilder answer = new StringBuilder();
        Stack<Character> st = new Stack<>();
        int nlen = number.length();
        int cnt = 0;
        
        for(int i = 0; i < nlen; i++) {
            while(!st.isEmpty() && st.peek() < number.charAt(i) && cnt++ < k) {
                st.pop();
            }
            
            st.push(number.charAt(i));
        }
        
        nlen -= k;
        for(int i = 0; i < nlen; i++) {
           answer.append(st.get(i));
        }
        
        return answer.toString();
    }
}
