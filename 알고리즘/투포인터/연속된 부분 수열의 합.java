class Solution {
    public int[] solution(int[] sequence, int k) {
        int slen = sequence.length;
        int[] answer = {0, slen - 1};
        int head = 0;
        int tail = 0;
        int sum = sequence[0];
        
        while(tail < slen) {
            if(sum > k) {
                sum -= sequence[head++];
                if(head > tail) {
                    if(++tail < slen){
                        sum += sequence[tail];
                    }
                }
            }else{
                if(sum == k && answer[1] - answer[0] > tail - head) {
                    answer[0] = head;
                    answer[1] = tail;
                }
                
                if(++tail < slen){
                    sum += sequence[tail];
                }
            }
        }
        
        return answer;
    }
}
