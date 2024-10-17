class Solution {
    public int solution(int[] numbers, int k) {
        if(k == 0) {
            return numbers[0];
        }

        return numbers[(2 * (k - 1)) % numbers.length];
    }
}
