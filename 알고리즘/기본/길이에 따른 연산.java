class Solution {
    public int solution(int[] num_list) {
        if(num_list.length < 11) {
            int ans = 1;
            for(int n : num_list) {
                ans *= n;
            }

            return ans;
        }

        int ans = 0;
        for(int n : num_list) {
            ans += n;
        }

        return ans;
    }
}
