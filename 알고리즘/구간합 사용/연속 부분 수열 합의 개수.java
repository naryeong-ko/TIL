import java.util.*;

class Solution {
    public int solution(int[] elements) {
        Set<Integer> set = new HashSet<>();
        int elen = elements.length;
        int[] sumArr = new int[elen * 2]; // 구간합 배열(1 ~ elen*2-1까지 사용)
        
        // 구간합 배열 초기화
        for(int i = 1; i <= elen; i++){
            sumArr[i] = sumArr[i - 1] + elements[i - 1];
        }
        for(int i = elen; i < elen * 2 - 1; i++){
            sumArr[i + 1] = sumArr[i] + elements[i - elen];
        }
        
        for(int l = 1; l <= elen; l++){ // 부분 수열 길이
            for(int i = 0; i < elen; i++){ // 부분 수열 시작점
                set.add(sumArr[i + l] - sumArr[i]);
            }   
        }
        
        return set.size();
    }
}
