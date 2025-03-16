class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length + 1];
        int idx = 0;
        for(int n : num_list) {
            answer[idx++] = n;
        }

        if(num_list[idx - 1] > num_list[idx - 2]) {
            answer[idx] = num_list[idx - 1] - num_list[idx - 2];
        } else {
            answer[idx] = num_list[idx - 1] * 2;
        }

        return answer;
    }
}
