class Solution {
    public int solution(String A, String B) {
        for(int i = 0; i < A.length(); i++) {
            if(A.equals(B.substring(i) + B.substring(0, i))) {
                return i;
            }
        }

        return -1;
    }
}
