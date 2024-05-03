class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int tlen = targets.length;
        int[] answer = new int[tlen];
        int[] cnts = new int[26];
        
        for(String key : keymap) { // 가장 빠른 횟수 저장
            int keyLen = key.length();
            for(int i = 0; i < keyLen; i++) {
                int idx = key.charAt(i) - 'A';
                if(cnts[idx] == 0 || cnts[idx] > i + 1) {
                    cnts[idx] = i + 1;
                }
            }    
        }
        
        for(int i = 0; i < tlen; i++) {
            int strLen = targets[i].length();
            for(int j = 0; j < strLen; j++) {
                int idx = targets[i].charAt(j) - 'A';
                if(cnts[idx] == 0) { // 존재하지 않으면 목표 문자열 작성 불가
                    answer[i] = -1;
                    break;
                }
                
                answer[i] += cnts[idx];
            }
        }
        
        return answer;
    }
}
