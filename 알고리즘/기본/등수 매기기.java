import java.util.*;

class Solution {
    class Pos {
        int idx;
        int sum;

        public Pos(int idx, int sum) {
            this.idx = idx;
            this.sum = sum;
        }
    }

    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        PriorityQueue<Pos> pq = new PriorityQueue<>((a, b) -> b.sum - a.sum);

        for(int i = 0; i < score.length; i++) {
            pq.add(new Pos(i, score[i][0] + score[i][1]));
        }

        int before = -1;
        int rank = 0;
        int cnt = 1;
        for(int i = 0; i < score.length; i++) {
            Pos now = pq.poll();
            if(before == now.sum) {
                answer[now.idx] = rank;
                cnt++;
            } else {
                rank += cnt;
                answer[now.idx] = rank;
                cnt = 1;
                before = now.sum;
            }
        }

        return answer;
    }
}
