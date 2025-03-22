import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        boolean[] checkList = new boolean[1001];

        for(int n : delete_list) {
            checkList[n] = true;
        }

        List<Integer> list = new ArrayList<>();
        for(int n : arr) {
            if(!checkList[n]) {
                list.add(n);
            }
        }

        int idx = 0;
        int[] answer = new int[list.size()];
        for(int n : list) {
            answer[idx++] = n;
        }

        return answer;
    }
}
