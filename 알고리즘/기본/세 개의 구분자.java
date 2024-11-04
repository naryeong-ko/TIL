import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        List<String> ss = new ArrayList<>();

        int start = 0;
        for(int i = 0; i < myStr.length(); i++) {
            switch(myStr.charAt(i)) {
                case 'a' :
                case 'b' :
                case 'c' :
                    if(start != i) {
                        ss.add(myStr.substring(start, i));
                    }

                    start = i + 1;
                    break;
            }
        }

        if(start != myStr.length()) {
            ss.add(myStr.substring(start));
        }

        if(ss.size() == 0) {
            return new String[]{"EMPTY"};
        }

        String[] answer = new String[ss.size()];
        for(int i = 0; i < ss.size(); i++) {
            answer[i] = ss.get(i);
        }

        return answer;
    }

}
