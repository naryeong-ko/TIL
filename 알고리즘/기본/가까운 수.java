class Solution {
    public int solution(int[] array, int n) {
        int answer = 101;
        int diff = 101;

        for(int a : array) {
            if(diff > Math.abs(n - a) || diff == Math.abs(n - a) && a < answer) {
                answer = a;
                diff = Math.abs(n - a);
            }
        }

        return answer;
    }
}
