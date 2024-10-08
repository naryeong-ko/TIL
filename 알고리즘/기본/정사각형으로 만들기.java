class Solution {
    public int[][] solution(int[][] arr) {
        int rlen = arr.length;
        int clen = arr[0].length;
        int len = Math.max(rlen, clen);
        int[][] answer = new int[len][len];

        for(int i = 0; i < rlen; i++) {
            for(int j = 0; j < clen; j++) {
                answer[i][j] = arr[i][j];
            }
            for(int j = clen; j < len; j++) {
                answer[i][j] = 0;
            }
        }

        for(int i = rlen; i < len; i++) {
            for(int j = 0; j < len; j++) {
                answer[i][j] = 0;
            }
        }

        return answer;
    }
}
