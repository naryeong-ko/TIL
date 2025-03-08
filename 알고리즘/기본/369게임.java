class Solution {
    public int solution(int order) {
        int answer = 0;
        boolean[] check = new boolean[10];
        for(int i = 3; i < 10; i += 3) {
            check[i] = true;
        }
        
        while(order > 0) {
            if(check[order % 10]) {
                answer++;
            }
            
            order /= 10;
        }
        
        return answer;
    }
}
