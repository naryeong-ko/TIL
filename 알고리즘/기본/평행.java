class Solution {
    public int solution(int[][] dots) {
        if(checkDots(dots, 0, 1, 2, 3) || checkDots(dots, 0, 2, 1, 3) || checkDots(dots, 0, 3, 1, 2)) {
            return 1;
        }

        return 0;
    }

    public boolean checkDots(int[][] dots, int a, int b, int c, int d) {
        return (dots[a][0] - dots[b][0]) * (dots[c][1] - dots[d][1]) == (dots[a][1] - dots[b][1]) * (dots[c][0] - dots[d][0]);
    }
}
