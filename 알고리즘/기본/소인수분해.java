import java.util.*;

class Solution {
    public int[] solution(int n) {
        List<Integer> list = new ArrayList<>();


        for(int i = 2; i <= n && n > 1; i++) {
            if(n % i == 0) {
                n /= i;
                list.add(i);

                while(n % i == 0) {
                    n /= i;
                }
            }
        }

        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
