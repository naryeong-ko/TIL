class Solution {
    private int answer = 0;
    public int solution(int k, int[][] dungeons) {
        dfs(k, 0, dungeons, new boolean[dungeons.length]);
        return answer;
    }
    
    public void dfs(int energy, int cnt, int[][] dungeons, boolean[] visited){
        answer = Math.max(answer, cnt);
        
        for(int i = 0; i < dungeons.length; i++){
            if(!visited[i] && energy >= dungeons[i][0]){
                visited[i] = true;
                dfs(energy - dungeons[i][1], cnt + 1, dungeons, visited);
                visited[i] = false;
            }
        }
    }
}
