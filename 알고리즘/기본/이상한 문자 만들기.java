class Solution {
    public String solution(String s) {
        String su = s.toUpperCase();
        StringBuilder sb = new StringBuilder();
        boolean low = false; // 단어 시작은 짝수이므로 대문자
        
        for(int i = 0; i < s.length(); i++) {
            if(su.charAt(i) == ' ') {
                sb.append(' ');
                low = false;
                continue;
            }
            
            if(low) { // 홀수, 소문자
                sb.append((char)(su.charAt(i) - 'A' + 'a'));
            }else {
                sb.append(su.charAt(i));
            }
            
            low = !low;
        }
        
        return sb.toString();
    }
}
