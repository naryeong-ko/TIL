class Solution {
    public String solution(String my_string, int[] indices) {
        StringBuilder answer = new StringBuilder();
        boolean[] check = new boolean[my_string.length()];

        for(int i : indices) {
            check[i] = true;
        }

        for(int i = 0; i < my_string.length(); i++) {
            if(!check[i]) {
                answer.append(my_string.charAt(i));
            }
        }

        return answer.toString();
    }
}
