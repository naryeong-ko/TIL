class Solution {
    public int solution(int[] num_list) {
        int[] answer = new int[2];

        int idx = 0;
        for(int n : num_list) {
            answer[idx++ % 2] += n;
        }

        return Math.max(answer[0], answer[1]);
    }
}
