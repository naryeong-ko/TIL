import java.util.*;

class Solution {
    public int[] solution(String[] gems) {
        int glen = gems.length;
        int[] ans = {1, glen}; // 초기값은 최댓값
        int totalCnt = 0; // 보석 총 종류
        int nowCnt = 0; // 내가 만든 범위의 보석 하나만 들어간 종류
        int tail = 0;
        int head = 0;
        Map<String, Integer> map = new HashMap<>(); // 보석이름, 개수
        
        for(int i = 0; i < glen; i++){
            map.put(gems[i], 0);
        }
        
        totalCnt = map.size();    
        while(head < glen && tail < glen){
            //tail 이동(tail 앞까지가 내가 센 범위)
            while(nowCnt != totalCnt && tail < glen){
                map.put(gems[tail], map.get(gems[tail]) + 1);
                if(map.get(gems[tail]) == 1){
                    nowCnt++;
                }
                tail++;
            }
            
            if(nowCnt == totalCnt){
                if(ans[1] - ans[0] > tail - head){
                    ans[0] = head;
                    ans[1] = tail;
                }
            }
            
            //head 이동
            while(nowCnt == totalCnt && head < glen){
                map.put(gems[head], map.get(gems[head]) - 1);
                if(map.get(gems[head]) == 0){
                    nowCnt--;
                }
                head++;
            }
            
            if(head < glen){
                if(ans[1] - ans[0] > tail - head){
                    ans[0] = head;
                    ans[1] = tail;
                }
            }
        }
        
        return ans;
    }
}
