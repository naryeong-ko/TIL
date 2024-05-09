class Solution {
    public int solution(String s) {
        int answer = 0;
        int cnt1 = 1;
        int cnt2 = 0;
        char c1 = s.charAt(0);
        int slen = s.length() - 1;
        
        for(int i = 1; i < slen; i++) {
            if(c1 == s.charAt(i)) {
                cnt1++;
            }else {
                cnt2++;
            }
            
            if(cnt1 == cnt2) {
                answer++;
                cnt1 = 1;
                cnt2 = 0;
                c1 = s.charAt(++i);
            }
        }
        
        return ++answer;
    }
}
