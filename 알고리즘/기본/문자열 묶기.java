class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        int[] cnt = new int[31];

        for(String s : strArr) {
            cnt[s.length()]++;
        }

        for(int c : cnt) {
            answer = Math.max(answer, c);
        }

        return answer;
    }
}
