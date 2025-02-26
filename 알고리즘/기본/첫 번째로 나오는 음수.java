class Solution {
    public int solution(int[] num_list) {
        int idx = 0;
        for(int n : num_list) {
            if(n < 0) {
                return idx;
            }

            idx++;
        }

        return -1;
    }
}
