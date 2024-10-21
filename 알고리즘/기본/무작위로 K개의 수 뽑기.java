class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        boolean[] check = new boolean[1000001];
        int idx = 0;

        for(int a : arr) {
            if(!check[a]) {
                check[a] = true;
                answer[idx++] = a;
                if(idx >= k) {
                    break;
                }
            }
        }

        while(idx < k) {
            answer[idx++] = -1;
        }

        return answer;
    }
}
