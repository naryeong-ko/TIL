class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = arr.clone();

        for(int i = 0; i < queries.length; i++) {
            int tmp = answer[queries[i][0]];
            answer[queries[i][0]] = answer[queries[i][1]];
            answer[queries[i][1]] = tmp;
        }

        return answer;
    }
}
