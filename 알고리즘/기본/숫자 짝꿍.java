class Solution {
    public String solution(String X, String Y) {
        StringBuilder answer = new StringBuilder();
        int[] xnums = makeNumsArr(X);
        int[] ynums = makeNumsArr(Y);
        
        for(int i = 9; i >= 0; i--) {
            int n = Math.min(xnums[i], ynums[i]);
            
            for(int j = 0; j < n; j++) {
                answer.append(i);
            }
        }
        
        if(answer.toString().equals("")) {
            return "-1";
        }
        
        if(answer.toString().charAt(0) == '0') {
            return "0";
        }
        
        return answer.toString();
    }
    
    public int[] makeNumsArr(String str) {
        int[] ret = new int[10];
        int slen = str.length();
        
        for(int i = 0; i < slen; i++) {
            ret[str.charAt(i) - '0']++;
        }
        
        return ret;
    }
}
