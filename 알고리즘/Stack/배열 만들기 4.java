import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        Stack<Integer> s = new Stack<>();
        int i = 0;
        while(i < arr.length) {
            if(s.empty() || s.peek() < arr[i]) {
                s.push(arr[i++]);
                continue;
            }

            if(s.peek() >= arr[i]) {
                s.pop();
            }
        }

        int[] stk = new int[s.size()];
        for(i = s.size() - 1; i >= 0; i--) {
            stk[i] = s.pop();
        }

        return stk;
    }
}
