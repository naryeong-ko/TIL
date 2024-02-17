class Solution {
    public long solution(int n) {
        if(n == 1){
            return 1;
        }
        
        long[] memo = new long[n + 1]; // 배열 값은 해당 인덱스에 도달하는 방법 개수 
        memo[1] = 1L;
        memo[2] = 2L;
        
        for(int i = 3; i <= n; i++){
            memo[i] = (memo[i - 1] + memo[i - 2]) % 1234567;
        }
        
        return memo[n];
    }
}
