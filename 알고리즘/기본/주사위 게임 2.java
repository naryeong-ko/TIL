class Solution {
    public int solution(int a, int b, int c) {
        int answer = a + b + c;

        if(a == b && a == c) {
            return answer * (a * a + b * b + c * c) * (a * a * a + b * b * b + c * c * c);
        } else if(a == b || a == c || b == c) {
            return answer * (a * a + b * b + c * c);
        }

        return answer;
    }
}
