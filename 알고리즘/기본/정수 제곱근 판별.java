class Solution {
    public long solution(long n) {
        long num = (long)(Math.sqrt(n) / 1);
        if(num * num == n) {
            return (num + 1) * (num + 1);
        }
        
        return -1;
    }
}
