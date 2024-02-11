class Solution {
    /*
    가로 >= 세로

    a * b = brown + yellow
    (a + b) * 2 - 4 = brown    
    */
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        
        while(true){
            answer[1]++;
            answer[0] = (brown + 4) / 2 - answer[1];
            
            if(answer[0] * answer[1] == brown + yellow){
                break;
            }
        }
        
        return answer;
    }
}
