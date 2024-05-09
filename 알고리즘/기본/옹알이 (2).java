class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        for(String b : babbling) {
            int blen = b.length();
            char before = '0';
            boolean success = true;
            
            for(int i = 0; i < blen;) {
                char c = b.charAt(i);
                int next = 3;
                
                if(before == c) {
                    success = false;
                    break;
                }
                
                if(c == 'a') {
                    if(i + 2 >= blen || !(b.charAt(i + 1) == 'y' && b.charAt(i + 2) == 'a')) {
                        success = false;
                        break;
                    }
                }else if(c == 'y') {
                    if(i + 1 >= blen || b.charAt(i + 1) != 'e') {
                        success = false;
                        break;
                    }
                    next = 2;
                }else if(c == 'w') {
                    if(i + 2 >= blen || !(b.charAt(i + 1) == 'o' && b.charAt(i + 2) == 'o')) {
                        success = false;
                        break;
                    }
                }else if(c == 'm') {
                    if(i + 1 >= blen || b.charAt(i + 1) != 'a') {
                        success = false;
                        break;
                    }
                    next = 2;
                }else {
                    success = false;
                    break;
                }
                
                before = c;
                i += next;
            }
            
            if(success) {
                answer++;
            }
        }
        
        return answer;
    }
}
