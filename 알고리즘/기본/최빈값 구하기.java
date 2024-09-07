class Solution {
    public int solution(int[] array) {
        int[] cnt = new int[1001];
        int answer = 0;
        boolean check = false;

        for(int a : array) {
            cnt[a]++;
            if(a != answer && cnt[a] == cnt[answer]) {
                check = true;
            }else if(cnt[a] >= cnt[answer]) {
                answer = a;
                check = false;
            }
        }

        if(check) {
            return -1;
        }
        return answer;
    }
}
