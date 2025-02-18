import java.util.*;

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        List<String> list = new ArrayList<>();

        for(int i = 0; i < todo_list.length; i++) {
            if(!finished[i]) {
                list.add(todo_list[i]);
            }
        }

        int idx = 0;
        String[] answer = new String[list.size()];
        for(String l : list) {
            answer[idx++] = l;
        }

        return answer;
    }
}
