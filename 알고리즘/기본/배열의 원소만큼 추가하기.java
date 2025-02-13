import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();

        for(int a : arr) {
            for(int i = 0; i < a; i++) {
                list.add(a);
            }
        }

        int[] answer = new int[list.size()];
        int idx = 0;
        for(int l : list) {
            answer[idx++] = l;
        }

        return answer;
    }
}
