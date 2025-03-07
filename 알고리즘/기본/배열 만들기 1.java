class Solution {
    public int[] solution(int n, int k) {
        int[] answer = new int[n / k];

        for(int i = k, idx = 0; i <= n; i += k, idx++) {
            answer[idx] = i;
        }

        return answer;
    }
}
