import java.util.*;

class Solution {
    private int nLen;
    private int cnt;
    private boolean[] visited;
    
    public int solution(int[] numbers, int target) {
        nLen = numbers.length;
        cnt = 0;
        visited = new boolean[nLen]; 
        
        int sum = 0;
        for(int i = 0; i < nLen; i++){
            sum += numbers[i];
        }

        getCnt(numbers, target, 0, sum);
        
        return cnt;
    }
    
    public void getCnt(int[] numbers, int target, int idx, int sum){
        if(sum == target){
            cnt++; 
        }
        
        for(int i = idx; i < nLen; i++){
            if(!visited[i]){
                visited[i] = true;
                getCnt(numbers, target, i + 1, sum - numbers[i] * 2);    
                visited[i] = false;
            }
            
        }
        
    }
    
}
