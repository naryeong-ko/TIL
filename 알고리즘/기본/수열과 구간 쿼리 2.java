class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];

        for(int i = 0; i < queries.length; i++) {
            answer[i] = 1000001;
            for(int j = queries[i][0]; j <= queries[i][1]; j++) {
                if(arr[j] > queries[i][2] && answer[i] > arr[j]) {
                    answer[i] = arr[j];
                }
            }

            if(answer[i] == 1000001) {
                answer[i] = -1;
            }
        }

        return answer;
    }
}
