import java.util.*;

class Solution {
    // 빵(1) 나오면 앞 3개 확인
    public int solution(int[] ingredient) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        
        for(int i : ingredient) {
            boolean noBurger = false;
            
            if(i == 1 && stack.size() > 2) {
                int[] getSI = new int[3];
                for(int j = 0; j < 3; j++) {
                    getSI[j] = stack.pop();
                }
                
                for(int j = 0; j < 3; j++) {
                    if(getSI[j] != 3 - j) {
                        noBurger = true;
                        for(int k = 2; k >= 0; k--) {
                            stack.push(getSI[k]);
                        }
                        stack.push(i);
                        break;
                    }
                }
                
                if(!noBurger) {
                    answer++;
                }
            } else {
                stack.push(i);
            }
        }
        
        return answer;
    }
}
