import java.util.*;

class Solution {
    public int[] solution(int n, long left, long right) {
        int len = (int)(right - left);
        int[] answer = new int[len + 1];
        Long num = left;
        int aIdx = 0;
        
        do{
            answer[aIdx++] = Math.max((int)(num / n), (int)(num % n)) + 1;
        }while(++num <= right);
        
        return answer;
    }
}
