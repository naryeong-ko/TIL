class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        int[] sameIdx = new int[26];
        
        for(int i = 0; i < s.length(); i++) {
            if(sameIdx[s.charAt(i) - 'a'] == 0) {
                sameIdx[s.charAt(i) - 'a'] = i + 1;
                answer[i] = -1;
            } else {
                answer[i] = i + 1 - sameIdx[s.charAt(i) - 'a'];
                sameIdx[s.charAt(i) - 'a'] = i + 1;
            }
        }
        
        return answer;
    }
}
