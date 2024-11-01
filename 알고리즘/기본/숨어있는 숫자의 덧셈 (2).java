class Solution {
    public int solution(String my_string) {
        int answer = 0;

        for(int i = 0; i < my_string.length(); i++) {
            int j = i;
            while(j < my_string.length() && my_string.charAt(j) - 'A' < 0) {
                j++;
            }

            if(j > i) {
                answer += Integer.parseInt(my_string.substring(i, j));
                i = j - 1;
            }
        }

        return answer;
    }
}
