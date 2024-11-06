class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        int[] ss = new int[26];

        for(int i = 0; i < s.length(); i++) {
            ss[s.charAt(i) - 'a']++;
        }

        for(int i = 0; i < 26; i++) {
            if(ss[i] == 1) {
                answer.append((char)(i + 'a'));
            }
        }

        return answer.toString();
    }
}
