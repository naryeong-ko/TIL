class Solution {
    public int solution(String my_string) {
        int answer = 0;

        for(char c : my_string.toCharArray()) {
            int n = c - '0';
            if(n > 0 && n < 10) {
                answer += n;
            }
        }

        return answer;
    }
}
