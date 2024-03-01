class Solution {
    public int solution(int[] topping) {
        int answer = 0;
        int tlen = topping.length;
        int[] arr1 = new int[10001]; // 동생이 가지고 있는 토핑 종류 별 개수
        boolean[] arr2 = new boolean[10001]; // 철수의 토핑 종류 별 소유 유무
        int cnt1 = 0; // 동생이 가진 토핑 종류 수
        int cnt2 = 0; // 철수가 가진 토핑 종류 수
        
        for(int i = 0; i < tlen; i++){ // 동생 다 주기
            if(arr1[topping[i]] == 0){
                cnt1++;
            }
            
            arr1[topping[i]]++;
        }
        
        int idx = 0;
        while(cnt1 >= cnt2){ // 철수에게 넘겨주기
            if(arr1[topping[idx]] == 1) {
                cnt1--;
            }
            arr1[topping[idx]]--;
            
            if(!arr2[topping[idx]]) {
                arr2[topping[idx]] = true;
                cnt2++;
            }
            
            if(cnt1 == cnt2) {
                answer++;
            }
            
            idx++;
        }
        
        
        return answer;
    }
}
