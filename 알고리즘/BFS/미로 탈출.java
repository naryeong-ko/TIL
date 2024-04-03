import java.util.*;

class Solution {

    class Pos {
        int r;
        int c;
        int cnt;

        public Pos(int r, int c) {
            this.r = r;
            this.c = c;
            this.cnt = 0;
        }
    }

    int[] dr = {-1, 1, 0, 0}; // 상하좌우
    int[] dc = {0, 0, -1, 1};

    public int solution(String[] maps) {
        int mrlen = maps.length;
        int mclen = maps[0].length();
        boolean[][][] canGo = new boolean[2][mrlen + 2][mclen + 2]; // 벽이 아니면 true

        Pos S = new Pos(0, 0);
        Pos E = new Pos(0, 0);
        Pos L = new Pos(0, 0);

        for(int i = 1; i <= mrlen; i++) {
            for(int j = 1; j <= mclen; j++) {
                char now = maps[i - 1].charAt(j - 1);

                if(now != 'X') {
                    if(now == 'S') {
                        S = new Pos(i , j);
                    } else if(now == 'E') {
                        E = new Pos(i , j);
                    } else if(now == 'L') {
                        L = new Pos(i, j);
                    }

                    canGo[0][i][j] = true;
                    canGo[1][i][j] = true;
                }
            }
        }

        int getCntL = bfs(S, L, canGo[0]); // S에서 L
        if(getCntL == -1) {
            return -1;
        }

        int getCntE = bfs(L, E, canGo[1]); // L에서 E
        if(getCntE == -1) {
            return -1;
        }

        return getCntL + getCntE;
    }

    public int bfs(Pos start, Pos goal, boolean[][] canGo) {
        Queue<Pos> q = new LinkedList<>();
        q.add(start);
        canGo[start.r][start.c] = false;

        while(!q.isEmpty()) {
            Pos nowP = q.poll();

            for(int d = 0; d < 4; d++) {
                Pos nextP = new Pos(nowP.r + dr[d], nowP.c + dc[d]);

                if(nextP.r == goal.r && nextP.c == goal.c) {
                    return nowP.cnt + 1;
                }

                if(canGo[nextP.r][nextP.c]) {
                    nextP.cnt = nowP.cnt + 1;
                    q.add(nextP);
                    canGo[nextP.r][nextP.c] = false;
                }
            }
        }

        return -1;
    }
}
