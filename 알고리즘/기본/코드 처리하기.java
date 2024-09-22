class Solution {
    public String solution(String code) {
        StringBuilder sb = new StringBuilder();
        int mode = 0;

        for(int i = 0; i < code.length(); i++) {
            if(code.charAt(i) == '1') {
                mode = (mode + 1) % 2;
            } else if(mode == i % 2) {
                sb.append(code.charAt(i));
            }
        }

        if(sb.length() == 0) {
            return "EMPTY";
        }
        return sb.toString();
    }
}
