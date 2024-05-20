class Solution {
    public int[] solution(int n, int m) {
        int largeSame = calLargeSame(n, m);
        int[] answer = {largeSame, (n * m / largeSame)};
        
        return answer;
    }
    
    public int calLargeSame(int a, int b) {
        if(b == 0) {
            return a;
        }
        
        return calLargeSame(b, a % b);
    }
}
