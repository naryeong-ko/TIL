class Solution {
    public int solution(String before, String after) {
        int[] bCnt = new int[26];
        int[] aCnt = new int[26];

        for(int i = 0; i < before.length(); i++) {
            aCnt[after.charAt(i) - 'a']++;
            bCnt[before.charAt(i) - 'a']++;
        }

        for(int i = 0; i < 26; i++) {
            if(aCnt[i] != bCnt[i]) {
                return 0;
            }
        }

        return 1;
    }
}
