class Solution {
    public String solution(String myString, String pat) {
        for(int i = myString.length() - 1; i > pat.length(); i--) {
            boolean find = true;

            for(int j = 0; j < pat.length(); j++) {
                if(myString.charAt(i - j) != pat.charAt(pat.length() - j - 1)) {
                    find = false;
                    break;
                }
            }

            if(find) {
                return myString.substring(0, i + 1);
            }
        }

        return pat;
    }
}
