import java.util.*;

class Solution {
    public int[] solution(int[] numlist, int n) {
        Integer[] answer = Arrays.stream(numlist).boxed().toArray(Integer[]::new);;
        Arrays.sort(answer, (o1, o2) -> {
            int n1 = Math.abs(o1 - n);
            int n2 = Math.abs(o2 - n);
            if(n1 != n2) {
                return n1 - n2;
            }

            return o2 - o1;
        });

        int[] ans = new int[numlist.length];
        for(int i = 0; i < numlist.length; i++) {
            ans[i] = (int) answer[i];
        }

        return ans;
    }
}
