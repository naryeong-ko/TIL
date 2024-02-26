import java.util.*;

class Solution {
    private int gyo;
    private int hap;
    private Map<String, Integer> map1;
    private Map<String, Integer> map2;
    
    public int solution(String str1, String str2) {
        if(!init(str1, str2)){
            return 65536;
        }
        
        makeGyoAndHap();
        return 65536 * gyo / hap;
    }
    
    public boolean init(String str1, String str2){
        gyo = 0;
        hap = 0;
        map2 = makeMap(str2.toLowerCase());
        map1 = makeMap(str1.toLowerCase());
        
        if(map1.size() == 0 && map2.size() == 0){
            return false;
        }
        
        return true;
    }
    
    public boolean checkWord(char w){ // 문자인지 구분
        return w >= 'a' && w <= 'z';
    }
    
    public Map<String, Integer> makeMap(String s){ // 다중집합 원소 만들기
        int slen = s.length();
        Map<String, Integer> map = new HashMap<>();
        
        for(int i = 0; i < slen - 1; i++){
            String now = "";
            if(!checkWord(s.charAt(i))){
                continue;
            }
            now += s.charAt(i);
            
            if(!checkWord(s.charAt(i + 1))){
                continue;
            }
            now += s.charAt(i + 1);
            
            int num = 1;
            if(map.containsKey(now)){
                num += map.get(now);
            }
                
            map.put(now, num);
        }
        
        return map;
    }
    
    public void makeGyoAndHap(){ // 교집합과 합집합 개수 세기
        Set<String> keySet1 = map1.keySet();
        for(String key : keySet1){ // 여기 for문에서 keySet의 key remove하면 오류 발생함
            if(map2.containsKey(key)){ // 공통 원소인 경우
                int num1 = map1.get(key);
                int num2 = map2.get(key);
                
                gyo += Math.min(num1, num2);
                hap += Math.max(num1, num2);

                map2.remove(key);
            }else{ // 공통 원소가 아닌 첫 번째 맵의 원소들 합집합 개수에 더하기
                hap += map1.get(key);
            }
        }
        
        Set<String> keySet2 = map2.keySet();
        for(String key : keySet2){ // 공통 원소가 아닌 두 번째 맵의 원소들 합집합 개수에 더하기
            hap += map2.get(key);
        }
    }
}
