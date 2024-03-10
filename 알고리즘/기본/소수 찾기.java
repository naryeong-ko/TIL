import java.util.*;

class Solution {
    
    private Set<Integer> set = new HashSet<>();
    
    public int solution(String numbers) {
        makeSet(numbers.split(""), "", new boolean[numbers.length()], numbers.length());
       
        int answer = 0;
        for(int n : set) {
            if(isPrime(n)) {
                answer++;
            }
        }
        
        return answer;
    }
    
    public void makeSet(String[] nums, String now, boolean[] visited, int nlen) { // 조합
        for(int i = 0; i < nlen; i++) {
            if(!visited[i]) {
                visited[i] = true;
                set.add(Integer.parseInt(now + nums[i]));
                makeSet(nums, now + nums[i], visited, nlen);
                visited[i] = false;
            }
        }
    }
    
    public boolean isPrime(int num) { // 소수 판별
        if(num <= 1) {
            return false;
        }
        
        for(int i = 2; i * i <= num; i++) {
            if(num % i == 0) {
                return false;
            }    
        }

        return true;
    }
}
