class Solution {
    public int[] solution(int[] arr, int n) {
        int[] answer = arr.clone();

        for(int i = (answer.length + 1) % 2; i < answer.length; i += 2) {
            answer[i] += n;
        }

        return answer;
    }
}
