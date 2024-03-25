class Solution {
    public long solution(int[] weights) {
        long answer = 0;
        long[] cntCalWeights = new long[4001];
        long[] cntRealWeights = new long[1001]; 
        
        for(int w : weights) {
            int[] cal = new int[3];
            for(int i = 0; i < 3; i++) {
                cal[i] = w * (i + 2);
            }
            
            for(int c : cal) {
                answer += cntCalWeights[c];
            }       
            answer -= cntRealWeights[w] * 2;
            
            for(int c : cal) {
                cntCalWeights[c]++;
            }
            cntRealWeights[w]++;
        }
        
        return answer;
    }
}
