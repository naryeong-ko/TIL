class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int[] answer = new int[intervals[0][1] - intervals[0][0] + intervals[1][1] - intervals[1][0] + 2];

        int idx = makeArr(arr, intervals[0], 0, answer);
        makeArr(arr, intervals[1], idx, answer);

        return answer;
    }

    public int makeArr(int[] arr, int[] inter, int idx, int[] nArr) {
        for(int i = inter[0]; i <= inter[1]; i++) {
            nArr[idx++] = arr[i];
        }

        return idx;
    }
}
