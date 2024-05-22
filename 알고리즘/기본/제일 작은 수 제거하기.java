class Solution {
    public int[] solution(int[] arr) {
        if(arr.length == 1) {
            return new int[] {-1};
        }
        
        int[] answer = new int[arr.length - 1];
        int minIdx = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[minIdx] > arr[i]) {
                minIdx = i;
            }
        }
        
        int idx = 0;
        for(int i = 0; i < arr.length; i++) {
            if(i != minIdx) {
                answer[idx++] = arr[i];
            }
        }
        
        return answer;
    }
}
