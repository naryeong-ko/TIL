import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        if(cacheSize == 0){ // 캐시 크기가 0이면 모두 miss
            return cities.length * 5;
        }
        
        int answer = 0;
        int clen = cities.length;
        LinkedList<String> list = new LinkedList<>(); // 현재 cache에 저장된 도시들
        
        for(int i = 0; i < clen; i++){
            String city = cities[i].toLowerCase();
            
            if(list.contains(city)){ // hit
                answer += 1;
                list.remove(city);
            }else{ // miss
                answer += 5;
                
                if(list.size() == cacheSize){ // cache가 가득 찬 경우
                    list.remove(0);
                }
            }
            
            list.add(city);
        }
        
        return answer;
    }
}
