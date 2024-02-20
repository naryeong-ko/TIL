import java.util.*;

class Solution {
    private int window = 10;
    private Map<String, Integer> map; // want 제품명, want 인덱스
    private int getCnt; // 얻은 개수
    private int goalCnt = 10;// 목표 개수
    private int[] getWantCnts; // 제품 별 얻은 개수
    private int answer;
    
    public int solution(String[] want, int[] number, String[] discount) {
        init(want, number, discount);
        getAnswer(want, number, discount);
        
        return answer;
    }
    
    public void init(String[] want, int[] number, String[] discount){
        answer = 0;
        int wlen = want.length;
        getWantCnts = new int[wlen];
        getCnt = 0;
        map = new HashMap<>();
        
        for(int i = 0; i < wlen; i++){
            map.put(want[i], i);
        }
        
        for(int i = 0; i < window; i++){
            addDiscount(i, number, discount);
        }

	    if(find()){
            answer++;
        }
    }
    
    public void getAnswer(String[] want, int[] number, String[] discount){
        int dlen = discount.length;
        
        for(int i = 0; i + window < dlen; i++){
            removeDiscount(i, number, discount);  // 앞에서 하나 빼기
            addDiscount(i + window, number, discount); // 뒤에서 하나 더하기
	        
            if(find()){
                answer++;
            }
        }
    }
    
    public boolean find(){
        return getCnt == goalCnt;
    }
    
    public void addDiscount(int i, int[] number, String[] discount){
        if(!map.containsKey(discount[i])){
            return;
        }
            
        int idx = map.get(discount[i]);
        if(++getWantCnts[idx] <= number[idx]){
            getCnt++;
        }
    }
    
    public void removeDiscount(int i, int[] number, String[] discount){
        if(!map.containsKey(discount[i])){
            return;
        }
        
        int idx = map.get(discount[i]);
        if(--getWantCnts[idx] < number[idx]){
            getCnt--;
        }
    }
}
