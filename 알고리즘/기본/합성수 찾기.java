class Solution {
    public int solution(int n) {
        int answer = 0;

        while(n > 3) {
            if(checkNum(n--)) {
                answer++;
            }
        }

        return answer;
    }

    public boolean checkNum(int n) {
        for(int i = 2; i * i <= n; i++) {
            if(n % i == 0) {
                return true;
            }
        }

        return false;
    }
}
