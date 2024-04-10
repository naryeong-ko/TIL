class Solution {
    public long solution(int cap, int n, int[] deliveries, int[] pickups) {
        long answer = 0;
        int dIdx = initIdx(n - 1, deliveries);
        int pIdx = initIdx(n - 1, pickups);
        
        
        while(dIdx > -1 || pIdx > -1) {
            answer += (Math.max(dIdx, pIdx) + 1) * 2; // 인덱스는 0부터 시작, 거리는 1부터 시작이므로 맞추기
            
            dIdx = moveIdx(dIdx, cap, deliveries);
            pIdx = moveIdx(pIdx, cap, pickups);
        }
        
        return answer;
    }
    
    public int initIdx(int idx, int[] arr) {
        while(idx > -1 && arr[idx] == 0) {
            idx--;
        }
        
        return idx;
    }
    
    
    public int moveIdx(int idx, int cap, int[] arr) {
        while(idx > -1) {    
            if(arr[idx] > 0) {
                if(cap - arr[idx] > 0) {
                    cap -= arr[idx];
                    arr[idx--] = 0;
                } else {
                    arr[idx] -= cap;
                    while(idx > -1 && arr[idx] == 0) {
                        idx--;
                    }
                    return idx;
                }
            }else {
                idx--;
            }
        }        
        
        return idx;
    }
}
