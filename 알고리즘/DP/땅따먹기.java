class Solution {
    
    // DP - 해당 열을 밟을 때의 최댓값 
    int solution(int[][] land) {
        int llen = land.length;
        int[][] memo = new int[llen][4];
        memo[0] = land[0];
        
        for(int r = 1; r < llen; r++) {
            for(int c = 0; c < 4; c++) {
                for(int i = 0; i < 4; i++) {
                    if(c == i){
                        continue;
                    }
                    
                    memo[r][c] = Math.max(memo[r][c], land[r][c] + memo[r - 1][i]);
                }
            }
        }
        
        int answer = memo[llen - 1][0];
        for(int i = 1; i < 4; i++) {
            answer = Math.max(answer, memo[llen - 1][i]);
        }
        
        return answer;
    }
}
