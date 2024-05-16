class Solution {
    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < s.length(); i++) {
            char word = 'A';
            if(s.charAt(i) == ' ') {
                sb.append(' ');
                continue;
            }
            
            if(s.charAt(i) >= 'a') {
                word = 'a';
            }
            
            sb.append((char)((s.charAt(i) - word + n) % 26 + word));
        }

        return sb.toString();
    }
}
