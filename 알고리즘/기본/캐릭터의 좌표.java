class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] dc = {1, -1, 0, 0};
        int[] dr = {0, 0, -1, 1};
        int rlen = board[0] / 2;
        int clen = board[1] / 2;
        int[] answer = new int[2];
        int d = 0;

        for(String s : keyinput) {
            switch(s) {
                case "up" : d = 0;
                    break;
                case "down" : d = 1;
                    break;
                case "left" : d = 2;
                    break;
                default : d = 3;
                    break;
            }

            int nr = answer[0] + dr[d];
            int nc = answer[1] + dc[d];
            if(nr < -rlen || nc < -clen || nr > rlen || nc > clen) {
                continue;
            }

            answer[0] = nr;
            answer[1] = nc;
        }

        return answer;
    }
}
