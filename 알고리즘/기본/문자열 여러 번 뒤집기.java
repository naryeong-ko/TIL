class Solution {
    public String solution(String my_string, int[][] queries) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < queries.length; i++) {
            sb.setLength(0);
            sb.append(my_string.substring(queries[i][0], queries[i][1] + 1)).reverse();
            sb.insert(0, my_string.substring(0, queries[i][0]));
            if(queries[i][1] < my_string.length()) {
                sb.append(my_string.substring(queries[i][1] + 1));
            }

            my_string = sb.toString();
        }

        return my_string;
    }
}
