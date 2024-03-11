import java.util.*;

class Solution {
    private int cnt;
    
    public int solution(int n, int[][] wires) {
        int answer = n; // 최댓값으로 초기화
        
        List<ArrayList<Integer>> tree = new ArrayList<>();
        for(int i = 0; i <= n ; i++) {
            tree.add(new ArrayList<>());
        }
        
        for(int i = 0; i < n - 1; i++) { // 그래프 저장
            tree.get(wires[i][0]).add(wires[i][1]);
            tree.get(wires[i][1]).add(wires[i][0]);
        }
        
        for(int i = 0; i < n - 1; i++) {
            cnt = 0;
            boolean[] visited = new boolean[n + 1];
            visited[wires[i][0]] = true;
            getCnt(wires[i][0], wires[i][1], visited, tree);
            answer = Math.min(answer, Math.abs(cnt - (n - cnt)));
        }
        
        return answer;
    }
    
    public void getCnt(int now, int ban, boolean[] visited, List<ArrayList<Integer>> tree) { // 그래프 크기
        cnt++;
        
        for(int t : tree.get(now)) {
            if(t != ban && !visited[t]) {
                visited[t] = true;
                getCnt(t, ban, visited, tree);         
            }
        }
    }
}
