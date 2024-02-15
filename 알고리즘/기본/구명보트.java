import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        int plen = people.length;
        int head = 0;
        int tail = plen - 1;
        Arrays.sort(people);
        
        while(head <= tail){
            if(people[head] + people[tail] <= limit){
                head++;   
            }
            
            tail--;
            answer++;
        }        
        
        return answer;
    }
}
