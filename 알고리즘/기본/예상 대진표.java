class Solution
{
    public int solution(int n, int a, int b)
    {
        int answer = 0;
        
        while(a != b){
            answer++;
            a = nextNum(a);
            b = nextNum(b);
        }
        
        return answer;
    }
    
    public int nextNum(int n){
        return n / 2 + n % 2;
    }
}
