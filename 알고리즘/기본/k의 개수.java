class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;

        for(int n = i; n <= j; n++) {
            int now = n;
            while(now > 0) {
                if(now % 10 == k) {
                    answer++;
                }

                now /= 10;
            }
        }

        return answer;
    }
}
