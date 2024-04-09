class Solution {
    public int solution(int storey) {
        int answer = 0;
        
        while(storey > 0) {
            int n = storey % 10;
            
            if(n > 5 || n == 5 && storey % 100 > 50) {
                answer += 10 - n;
                storey += 10 - n;
            } else {
                answer += n;
            }
            
            storey /= 10;
        }
        
        return answer;
    }
}
