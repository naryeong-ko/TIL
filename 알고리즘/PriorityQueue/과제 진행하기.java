import java.util.*;

class Solution {
    class Plan {
        String name;
        int start;
        int playtime;
        
        public Plan(String name, int start, int playtime) {
            this.name = name;
            this.start = start;
            this.playtime = playtime;
        }
    }
    
    public String[] solution(String[][] plans) {
        int plen = plans.length;
        String[] answer = new String[plen];
        Stack<Plan> stack = new Stack<>();
        int idx = 0;
        
        PriorityQueue<Plan> planQ = new PriorityQueue<>((p1, p2) -> {
            return p1.start - p2.start;
        });
        
        for(int i = 0; i < plen; i++) {
            int h = Integer.valueOf(plans[i][1].substring(0, 2));
            int m = Integer.valueOf(plans[i][1].substring(3));
            
            planQ.add(new Plan(plans[i][0], h * 60 + m, Integer.valueOf(plans[i][2])));
        }
        
        while(planQ.size() > 1) {
            Plan now = planQ.poll();
            Plan next = planQ.peek();
            
            int remain = next.start - now.start;
            stack.push(now);
            while(remain > 0 && !stack.isEmpty()) { // 다음 과제 전까지 남은 시간 동안 과제 해결
                Plan p = stack.pop();
                if(remain < p.playtime) { // 못 해결한 과제
                    p.playtime -= remain;
                    stack.push(p);
                    break;
                }
                
                remain -= p.playtime; // 해결한 과제
                answer[idx++] = p.name;
            }
        }
        
        answer[idx++] = planQ.poll().name; // 마지막 과제
        
        while(idx < plen && !stack.isEmpty()) { // 남은 과제
            answer[idx++] = stack.pop().name;
        }
        
        return answer;
    }
}
