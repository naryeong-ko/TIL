import java.util.*;

class Solution {
    class Pos{
        int r;
        int c;
        int dis;
        
        public Pos(int r, int c, int dis) {
            this.r = r;
            this.c = c;
            this.dis = dis;
        }
    }
    
    int[] dr = {-1, 1, 0, 0}; // 상하좌우
    int[] dc = {0, 0, -1, 1};
    
    public int solution(int[][] rectangle, int characterX, int characterY, int itemX, int itemY) {
        return getItem(initRectCheckMap(rectangle), new Pos(characterX * 2, characterY * 2, 0), new Pos(itemX * 2, itemY * 2, 0));
    }
    
    public int[][] initRectCheckMap(int[][] rectangle) { // 1 : 테두리, 2: 지난 테두리, 5: 내부
        int[][] ret = new int[101][101];
        int rlen = rectangle.length;
        
        for(int i = 0; i < rlen; i++) {
            // 테두리
            int c = rectangle[i][1] * 2;
            int r = rectangle[i][0] * 2;
            while(r < rectangle[i][2] * 2) {
                if(ret[r][c] == 0) {
                    ret[r][c] = 1;
                }
                
                r++;
            }
            
            while(c < rectangle[i][3] * 2) {
                if(ret[r][c] == 0) {
                    ret[r][c] = 1;
                }
                
                c++;
            }
            
            while(r > rectangle[i][0] * 2) {
                if(ret[r][c] == 0) {
                    ret[r][c] = 1;
                }
                
                r--;
            }
            
            while(c > rectangle[i][1] * 2) {
                if(ret[r][c] == 0) {
                    ret[r][c] = 1;
                }
                
                c--;
            }
            
            // 내부
            for(r = rectangle[i][0] * 2 + 1; r < rectangle[i][2] * 2; r++) {
                for(c = rectangle[i][1] * 2 + 1; c < rectangle[i][3] * 2; c++) {
                    ret[r][c] = 5;
                }
            }
        }
        
        return ret;
    }
    
    public int getItem(int[][] rcMap, Pos start, Pos goal) {
        Queue<Pos> q = new LinkedList<>();
        q.add(start);
        rcMap[start.r][start.c] = 2;
        
        while(!q.isEmpty()) {
            Pos nowP = q.poll();
            
            for(int d = 0; d < 4; d++) {
                int nextPr = nowP.r + dr[d];
                int nextPc = nowP.c + dc[d];
                
                if(nextPr == goal.r && nextPc == goal.c) {
                    return (nowP.dis + 1) / 2;
                }
                
                if(nextPr < 0 || nextPr > 100 || nextPc < 0 || nextPc > 100) {
                    continue;
                }
                
                if(rcMap[nextPr][nextPc] == 1) {
                    q.add(new Pos(nextPr, nextPc, nowP.dis + 1));
                    rcMap[nextPr][nextPc] = 2;
                }               
            }
            
            
        }
        
        return -1;
    }
}
