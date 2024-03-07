import java.util.*;

class Solution {
    class Num {
        int n; // 숫자
        int len; // 길이
        
        public Num(int n, int len) {
            this.n = n;
            this.len = len;
        }
    }
    
    public String solution(int[] numbers) {
        int nlen = numbers.length;
        List<Num> nums = new LinkedList<>();
        
        for(int i = 0; i < nlen; i++){
            nums.add(new Num(numbers[i], getLen(numbers[i])));
        }
        
        Collections.sort(nums, new Comparator<Num>() {
            @Override
            public int compare(Num a, Num b) {
                int ab = a.n * (int)Math.pow(10, b.len) + b.n;
                int ba = b.n * (int)Math.pow(10, a.len) + a.n;
                
                return ba - ab;
            }    
        });
        
        if(nums.get(0).n == 0){
            return "0";
        }
        
        StringBuilder answer = new StringBuilder();
        for(Num num : nums) {
            answer.append(num.n);
        }
        
        return answer.toString();
    }
    
    public int getLen(int n){
        if(n < 10){
            return 1;
        }
        
        int ret = 1;
        while(n >= 10){
            n /= 10;
            ret++;
        }
        
        return ret;
    }
}
