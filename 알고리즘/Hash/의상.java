import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        int clen = clothes.length;
        Map<String, Integer> map = new HashMap<>();
        
        for(int i = 0; i < clen; i++){
            int num = 0;
            if(map.containsKey(clothes[i][1])){
                num = map.get(clothes[i][1]);
            }
            
            map.put(clothes[i][1], num + 1);
        }
        
        Set<String> keySet = map.keySet();
        for(String key : keySet){
            answer *= map.get(key) + 1;
        }
        
        return --answer;
    }
}
