class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        int max = Math.max(wallet[0], wallet[1]);
        int min = Math.min(wallet[0], wallet[1]);
        int bmax = Math.max(bill[0], bill[1]);
        int bmin = Math.min(bill[0], bill[1]);

        while(bmax > max || bmin > min) {
            int tmp = bmax / 2;
            bmax = Math.max(tmp, bmin);
            bmin = Math.min(tmp, bmin);

            answer++;
        }

        return answer;
    }
}
