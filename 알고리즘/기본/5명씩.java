class Solution {
    public String[] solution(String[] names) {
        int len = names.length % 5 > 0 ? names.length / 5 + 1 : names.length / 5;

        String[] answer = new String[len];
        int idx = 0;
        for(int i = 0; idx < names.length; i++, idx += 5) {
            answer[i] = names[idx];
        }
        return answer;
    }
}
