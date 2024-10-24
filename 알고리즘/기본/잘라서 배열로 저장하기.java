class Solution {
    public String[] solution(String my_str, int n) {
        int len = my_str.length() / n;
        if(my_str.length() % n != 0) {
            len++;
        }

        String[] answer = new String[len];
        for(int i = 0; i < len - 1; i++) {
            answer[i] = my_str.substring(i * n, i * n + n);
        }

        answer[len - 1] = my_str.substring((len - 1) * n);

        return answer;
    }
}
