import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        int nlen = numbers.length;
        int[] answer = new int[nlen];
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        
        for(int i = nlen - 1; i >= 0; i--) {
            while(!stack.isEmpty()) {
                int peeked = stack.peek();
                if(peeked > numbers[i]){
                    answer[i] = peeked;
                    break;
                }
                stack.pop();
            }
            
            if(answer[i] == 0){
                answer[i] = -1;
            }
            
            stack.push(numbers[i]);
        }
        
        return answer;
    }
}
