class Solution {
    public int solution(int[] array) {
        int answer = 0;

        for(int a : array) {
            while(a > 0) {
                if(a % 10 == 7) {
                    answer++;
                }

                a /= 10;
            }
        }

        return answer;
    }
}
