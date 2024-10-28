class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];

        for(int i = 0; i < my_string.length(); i++) {
            int n = my_string.charAt(i) - 'A';
            if(n >= 32) {
                n -= 6;
            }
            answer[n]++;
        }

        return answer;
    }
}
