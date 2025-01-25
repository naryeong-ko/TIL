import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        List<Integer> nums = new ArrayList<>();

        for(int i = l; i <= r; i++) {
            String s = Integer.toString(i);
            s = s.replace("0", "").replace("5", "");

            if(s.length() == 0) {
                nums.add(i);
            }
        }

        if(nums.size() == 0) {
            return new int[]{-1};
        }

        int[] answer = new int[nums.size()];
        for(int i = 0; i < nums.size(); i++) {
            answer[i] = nums.get(i);
        }

        return answer;
    }
}
