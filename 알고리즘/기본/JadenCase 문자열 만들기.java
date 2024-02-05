class Solution {
    public String solution(String s) {
        int slen = s.length();
        boolean makeBig = true;
        StringBuilder answer = new StringBuilder();
        
        for(int i = 0; i < slen; i++){
            char c = s.charAt(i);
            
            if(c == ' '){ // 공백인 경우
                makeBig = true;
            }else if(makeBig){
                if(c - '0' >= 49){ // 첫 문자가 소문자인 경우
                    c = (char)(c - 32);
                }
                makeBig = false;
            }else if((c - '0' > 9) && (c - '0' < 49)){ // 첫 문자 아닌데 대문자인 경우
                c = (char)(c + 32);
            }
            
            answer.append(c);
        }
        
        return answer.toString();
    }
}
