import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        Stack<Integer> stk = new Stack<>();
        for(int a : arr) {
            if(!stk.isEmpty() && stk.peek() == a) {
                stk.pop();
            } else {
                stk.push(a);
            }
        }

        if(stk.isEmpty()) {
            return new int[] {-1};
        }

        int[] answer = new int[stk.size()];
        for(int i = stk.size() - 1; i >= 0; i--) {
            answer[i] = stk.pop();
        }
        return answer;
    }
}
