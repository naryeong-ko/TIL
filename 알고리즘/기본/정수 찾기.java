class Solution {
    public int solution(int[] num_list, int n) {
        for(int l : num_list) {
            if(l == n) {
                return 1;
            }
        }

        return 0;
    }
}