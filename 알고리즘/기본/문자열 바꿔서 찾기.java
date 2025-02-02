import java.util.*;

class Solution {
    public int solution(String myString, String pat) {
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < myString.length(); i++) {
            if(myString.charAt(i) == 'A') {
                sb.append('B');
            } else {
                sb.append('A');
            }
        }

        if(sb.toString().contains(pat)) {
            return 1;
        }
        return 0;
    }
}
