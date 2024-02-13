class Solution {
    public int solution(int n) {
        int answer = n;
        int nOneCnt = getOneCnt(n);
        
        while(nOneCnt != getOneCnt(++answer)){
        }
        
        return answer;
    }
    
    public int getOneCnt(int n){
        int ret = 0;
        
        while(n > 0){
            if(n % 2 == 1){
                ret++;
            }
            
            n /= 2;
        }
        
        return ret;
    }
}
