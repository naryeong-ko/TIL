class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 1; // number1의 약수 개수로 초기화
        
        for(int i = 2; i <= number; i++) {
            answer += calFe(i, limit, power);
        }
        
        return answer;
    }
    
    public int calFe(int n, int limit, int power) {
        int ret = 2; // 1과 본인
        
        int i = 2;
        for(; i * i < n; i++) {
            if(n % i == 0){
                ret+= 2; 
                if(ret > limit) {
                    return power;
                }
            } 
        }
        
        if(i * i == n) {
            if(++ret > limit) {
                return power;
            }
        }
        
        return ret;
    }
}
