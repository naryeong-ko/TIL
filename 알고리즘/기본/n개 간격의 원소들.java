class Solution {
    public int[] solution(int[] num_list, int n) {
        int len = 1 + (num_list.length - 1) / n;
        int[] answer = new int[len];

        for(int i = 0; i < len; i++) {
            answer[i] = num_list[i * n];
        }

        return answer;
    }
}
