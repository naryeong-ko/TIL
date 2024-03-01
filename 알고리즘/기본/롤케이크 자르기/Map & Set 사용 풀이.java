import java.util.*;

class Solution {
    public int solution(int[] topping) {
        int answer = 0;
        int tlen = topping.length;
        Set<Integer> set = new HashSet<>(); // 철수가 가질 토핑 종류
        Map<Integer, Integer> map = new HashMap<>(); // 동생이 가질 토핑 종류 별 개수
        
        for(int i = 0; i < tlen; i++) { // 우선 동생한테 다 주기
            int num = 1;
            if(map.containsKey(topping[i])) {
                num += map.get(topping[i]);
            }
            
            map.put(topping[i], num);
        }
        
        int idx = 0;
        while(map.size() >= set.size()) { // 철수에게 넘겨주기
            int cnt = map.get(topping[idx]);
            if(cnt == 1) {
                map.remove(topping[idx]);
            }else {
                map.put(topping[idx], cnt - 1);
            }
            
            set.add(topping[idx++]);
            
            if(map.size() == set.size()) {
                answer++;
            }
        }
        
        return answer;
    }
}
