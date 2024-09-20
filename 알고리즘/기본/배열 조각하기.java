class Solution {
    public int[] solution(int[] arr, int[] query) {
        int head = 0;
        int tail = arr.length - 1;

        for(int i = 0; i < query.length; i++) {
            if(i % 2 == 0) {
                tail = head + query[i];
            } else {
                head += query[i];
            }
        }

        int[] answer = new int[tail - head + 1];
        for(int i = 0; i + head <= tail; i++) {
            answer[i] = arr[i + head];
        }

        return answer;
    }
}
