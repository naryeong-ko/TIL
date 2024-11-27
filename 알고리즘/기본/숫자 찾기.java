class Solution {
    public int solution(int num, int k) {
        int nLen = Integer.toString(num).length();
        int idx = 0;
        int ans = -1;

        while(num > 0) {
            if(num % 10 == k) {
                ans = nLen - idx;
            }

            num /= 10;
            idx++;
        }

        return ans;
    }
}
