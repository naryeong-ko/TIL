class Solution {
    private int[] person1 = {1, 2, 3, 4, 5};
    private int[] person2 = {2, 1, 2, 3, 2, 4, 2, 5};
    private int[] person3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
    
    public int[] solution(int[] answers) {
        int alen = answers.length;
        int idx = 0;
        int[] ansCnt = new int[3];
        for(int a : answers) { // 채점
            if(a == person1[idx % 5]) {
                ansCnt[0]++;
            }
            if(a == person2[idx % 8]) {
                ansCnt[1]++;
            }
            if(a == person3[idx++ % 10]) {
                ansCnt[2]++;
            }
        }
        
        int maxNum = 0;
        int cnt = 1;
        for(int i = 0; i < 3; i++) { // 가장 높은 점수와 그 점수를 받은 사람 수
            if(maxNum == ansCnt[i]){
                cnt++;
            }else if(maxNum < ansCnt[i]){
                maxNum = ansCnt[i];
                cnt = 1;
            }
        }
        
        int[] answer = new int[cnt];
        idx = 0;
        for(int i = 0; i < 3; i++) { // 가장 높은 점수 받은 사람
            if(maxNum == ansCnt[i]){
                answer[idx++] = i + 1;
            }
        }
        
        return answer;
    }
}
