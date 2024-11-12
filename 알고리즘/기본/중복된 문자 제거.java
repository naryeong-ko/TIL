class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        boolean[] check = new boolean[91];

        for(int i = 0; i < my_string.length(); i++) {
            if(!check[my_string.charAt(i) - ' ']) {
                check[my_string.charAt(i) - ' '] = true;
                sb.append(my_string.charAt(i));
            }
        }

        return sb.toString();
    }
}
