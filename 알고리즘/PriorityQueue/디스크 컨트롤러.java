import java.util.*;

class Solution {
    class Job{
        int rt; // 요청시간
        int ct; // 소요시간
        
        public Job(int rt, int ct) {
            this.rt = rt;
            this.ct = ct;
        }
    }
    
    public int solution(int[][] jobs) {
        int answer = 0;
        int time = 0;
        
        PriorityQueue<Job> rq = new PriorityQueue<>((o1, o2) -> o1.rt - o2.rt); // 요청 전 큐(요청시간 기준 오름차순)
        PriorityQueue<Job> cq = new PriorityQueue<>((o1, o2) -> o1.ct - o2.ct); // 요청 후 큐 (소요시간 기준 오름차순)
       
        int jlen = jobs.length;
        for(int i = 0; i < jlen; i++) {
            rq.add(new Job(jobs[i][0], jobs[i][1]));
        }
        
        while(!rq.isEmpty() || !cq.isEmpty()) { // 모든 업무가 처리되기 전까지
            while(!rq.isEmpty() && rq.peek().rt <= time) { // 현재 시간까지 요청된 업무
                cq.add(rq.poll());
            }
            
            if(cq.isEmpty()) { // 처리할 수 있는 업무가 없는 경우
                time = rq.peek().rt;
                continue;
            }
            
            Job now = cq.poll();
            answer += time + now.ct - now.rt;
            time += now.ct;
        }
        
        return answer / jlen;
    }
}
