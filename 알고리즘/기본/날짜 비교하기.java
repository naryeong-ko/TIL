class Solution {
    public int solution(int[] date1, int[] date2) {
        for(int i = 0; i < 3; i++) {
            if(date1[i] > date2[i]) {
                return 0;
            }

            if(date1[i] < date2[i]) {
                return 1;
            }
        }

        return 0;
    }
}
