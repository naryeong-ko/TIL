class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        boolean answer = false;
        if(ineq.equals(">")) {
            if(eq.equals("=")) {
                if(n >= m) {
                    answer = true;
                }
            } else if(n > m) {
                answer = true;
            }
        } else {
            if(eq.equals("=")) {
                if(n <= m) {
                    answer = true;
                }
            }else if(n < m) {
                answer = true;
            }
        }

        return answer? 1 : 0;
    }
}
