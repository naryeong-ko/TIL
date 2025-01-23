class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int t = total / num + (num % 2 == 0? 1 : 0);

        for(int i = 0; i < num; i++) {
            answer[i] = t - num / 2 + i;
        }

        return answer;
    }
}
