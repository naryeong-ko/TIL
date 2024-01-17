import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        String num = s;
        
        while(true){
            int[] nums = countZero(num);
            answer[0]++;
            answer[1] += nums[0];
            
            if(nums[1] == 1){
                break;
            }
            
            num = changeToTwo(nums[1]);
        }
        
        return answer;
    }
    
    public int[] countZero(String num){
        int[] ret = new int[2]; // 0 개수, 바뀐 숫자 
        int nlen = num.length();
        
        for(int i = 0; i < nlen; i++){
            if(num.charAt(i) == '0'){
                ret[0]++;
            }else{
                ret[1]++;
            }
        }
        
        return ret;
    }
    
    public String changeToTwo(int num){
        StringBuilder ret = new StringBuilder();
        while(num > 0){
            ret.append(num % 2);
            num /= 2;
        }
        return ret.toString();
    }
}
