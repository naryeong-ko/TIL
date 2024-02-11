class Solution {
    public int solution(int n) {
        int[] memo = new int[n + 1];
        memo[1] = 1;
        memo[2] = 1;
        
        for(int i = 3; i <= n; i++){
            memo[i] = (memo[i - 1] + memo[i - 2]) % 1234567;
        }
        
        return memo[n];
    }
}
