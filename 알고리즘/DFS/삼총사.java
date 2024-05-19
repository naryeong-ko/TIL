class Solution {
    private int answer;
    
    public int solution(int[] number) {
        answer = 0;
        findThree(number, new boolean[number.length], 0, 0, 0);
        return answer;
    }
    
    public void findThree(int[] number, boolean[] visited, int idx, int cnt, int sum) {
        if(cnt == 3) {
            if(sum == 0) {
                answer++;
            }
            
            return;
        }
        
        for(int i = idx; i < number.length; i++) {
            visited[i] = true;
            findThree(number, visited, i + 1, cnt + 1, sum + number[i]);
            visited[i] = false;
        }
        
    }
    
    
}
