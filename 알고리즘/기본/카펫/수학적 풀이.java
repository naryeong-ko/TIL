import java.util.*;

class Solution {
    /*
    가로 >= 세로

    a * b = brown + yellow
    a + b = (brown + 4) / 2
    (a - b) ^ 2 == (a + b) ^ 2 - 4ab
    b = a + b - (a - b) / 2
    a = a + b - b
    */
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        
        int sum = (brown + 4) / 2;
        int mul = brown + yellow;
        int min = (int)Math.sqrt(sum * sum - 4 * mul);
        int a = (sum - min) / 2;
        int b = sum - a;
        
        answer[0] = Math.max(a, b);
        answer[1] = Math.min(a, b);
        
        return answer;
    }
}
