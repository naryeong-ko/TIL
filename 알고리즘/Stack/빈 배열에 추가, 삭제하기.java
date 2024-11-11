import java.util.*;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        Stack<Integer> st = new Stack<>();

        for(int i = 0; i < arr.length; i++) {
            if(flag[i]) {
                for(int j = 0; j < arr[i] * 2; j++) {
                    st.push(arr[i]);
                }
            } else {
                for(int j = 0; j < arr[i]; j++) {
                    st.pop();
                }
            }
        }

        int stSize = st.size();
        int[] answer = new int[stSize];
        for(int i = stSize - 1; i >= 0; i--) {
            answer[i] = st.pop();
        }

        return answer;
    }
}
