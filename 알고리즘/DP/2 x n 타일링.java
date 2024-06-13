class Solution {
    public int solution(int n) {
        int[] memo = new int[n + 1];
        if(n == 1) {
            return 1;
        }
        
        memo[1] = 1;
        memo[2] = 2;
        
        for(int i = 3; i <= n; i++) {
            memo[i] = (memo[i - 1] + memo[i - 2]) % 1000000007;
        }
        
        return memo[n];
    }
}

/*
// 메모리를 더 적게 쓰는 게 나을까~?
class Solution {
    public int solution(int n) {
        int[] memo = new int[2];

        if(n == 1) {
            return 1;
        }
        
        int answer = 2;
        memo[0] = 1;
        memo[1] = 2;
        
        for(int i = 3; i <= n; i++) {
            answer = (memo[0] + memo[1]) % 1000000007;
            memo[0] = memo[1];
            memo[1] = answer;
        }
        
        return answer;
    }
}
*/
