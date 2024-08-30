class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int num = 1;
        int r = 0;
        int c = 0;
        int dir = 0;
        int[] dr = {0, 1, 0, -1};
        int[] dc = {1, 0, -1, 0};

        while (num <= n * n) {
            answer[r][c] = num++;
            int nr = r + dr[dir];
            int nc = c + dc[dir];
            if (nr < 0 || nc < 0 || nr >= n || nc >= n || answer[nr][nc] != 0) {
                dir = (dir + 1) % 4;
                nr = r + dr[dir];
                nc = c + dc[dir];
            }

            r = nr;
            c = nc;
        }

        return answer;
    }
}