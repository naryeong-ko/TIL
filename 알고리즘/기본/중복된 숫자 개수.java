class Solution {
    public int solution(int[] array, int n) {
        int[] answer = new int[1001];

        for(int i : array) {
            answer[i]++;
        }

        return answer[n];
    }
}