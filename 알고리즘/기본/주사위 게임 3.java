import java.util.*;

class Solution {

    public int solution(int a, int b, int c, int d) {
        int[] nums = {a, b, c, d};
        Arrays.sort(nums);

        // 네 개 같음
        if(nums[0] == nums[3]) {
            return 1111 * nums[0];
        }

        // 세 개 같음
        if(nums[0] == nums[2]) {
            int ans = 10 * nums[0] + nums[3];
            return ans * ans;
        }
        if(nums[1] == nums[3]) {
            int ans = 10 * nums[1] + nums[0];
            return ans * ans;
        }

        // 두 개씩 같음
        if(nums[0] == nums[1] && nums[2] == nums[3]) {
            return (nums[2] + nums[0]) * (nums[2] - nums[0]);
        }

        // 두 개 같고 나머지 다름
        if(nums[0] == nums[1]) {
            return nums[2] * nums[3];
        }
        if(nums[1] == nums[2]) {
            return nums[0] * nums[3];
        }
        if(nums[2] == nums[3]) {
            return nums[0] * nums[1];
        }

        // 다 다름
        return nums[0];
    }
}
