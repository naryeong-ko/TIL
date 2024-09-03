class Solution {
    public int solution(int[][] board) {
        int[] dr = {1, -1, 0, 0, -1, 1, 1, -1};
        int[] dc = {0, 0, 1, -1, 1, 1, -1, -1};
        boolean[][] vboard = new boolean[board.length][board.length];
        int answer = board.length * board.length;

        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board.length; j++) {
                if(board[i][j] == 1) {
                    if(!vboard[i][j]) {
                        vboard[i][j] = true;
                        answer--;
                    }

                    for(int d = 0; d < 8; d++) {
                        int nr = i + dr[d];
                        int nc = j + dc[d];

                        if(nr < 0 || nr >= board.length || nc < 0 || nc >= board.length || vboard[nr][nc]) {
                            continue;
                        }

                        vboard[nr][nc] = true;
                        answer--;
                    }
                }
            }
        }

        return answer;
    }
}
