class Solution {
    public int[][] solution(int[] num_list, int n) {
        int l = num_list.length / n;
        int[][] answer = new int[l][n];
        int idx = 0;

        for(int i = 0; i < l; i++) {
            for(int j = 0; j < n; j++) {
                answer[i][j] = num_list[idx++];
            }
        }

        return answer;
    }
}
