class Solution {
    public int solution(int n) {
        int answer = 1;
        int mul = 1;

        while(n >= mul) {
            mul *= ++answer;
        }

        return --answer;
    }
}
