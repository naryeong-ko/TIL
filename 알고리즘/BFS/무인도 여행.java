import java.util.*;

class Solution {
    class Point {
        int r;
        int c;
        
        public Point(int r, int c) {
            this.r = r;
            this.c = c;
        }
    }
    
    int[] dr = {-1, 1, 0, 0}; // 상하좌우
    int[] dc = {0, 0, -1, 1};
    
    public int[] solution(String[] maps) {
        int rlen = maps.length;
        int clen = maps[0].length();
        int xCnt = 0;
        
        boolean[][] visited = new boolean[rlen][clen];
        
        for(int i = 0; i < rlen; i++) {
            for(int j = 0; j < clen; j++) {
                if(maps[i].charAt(j) == 'X') {
                    visited[i][j] = true;
                    xCnt++;
                }
            }
        }
        
        if(xCnt == rlen * clen) {
            return new int[] {-1};
        }
        
        List<Integer> ansList = new ArrayList<>();
        for(int i = 0; i < rlen; i++) {
            for(int j = 0; j < clen; j++) {
                if(!visited[i][j]) {
                    ansList.add(bfs(maps, new Point(i, j), visited, rlen, clen));
                }
            }
        }
        
        int[] answer = new int[ansList.size()];
        int idx = 0;
        for(int a : ansList) {
            answer[idx++] = a;
        }
        
        Arrays.sort(answer);
        return answer;
    }
    
    public int bfs(String[] maps, Point start, boolean[][] visited, int rlen, int clen) {
        Queue<Point> q = new LinkedList<>();
        int ret = maps[start.r].charAt(start.c) - '0';
        
        q.add(start);
        visited[start.r][start.c] = true;
        while(!q.isEmpty()) {
            Point p = q.poll();
            
            for(int d = 0; d < 4; d++) {
                int nr = p.r + dr[d];
                int nc = p.c + dc[d];
                
                if(nr < 0 || nr >= rlen || nc < 0 || nc >= clen || visited[nr][nc]) {
                    continue;
                }
                
                ret += maps[nr].charAt(nc) - '0';
                q.add(new Point(nr, nc));
                visited[nr][nc] = true;
            }
        }
        
        return ret;
    }
}
