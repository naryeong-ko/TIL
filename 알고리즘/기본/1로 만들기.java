class Solution {
    public int solution(int[] num_list) {
        int answer = 0;

        for(int n : num_list) {
            while(n > 1) {
                n /= 2;
                answer++;
            }
        }

        return answer;
    }
}
