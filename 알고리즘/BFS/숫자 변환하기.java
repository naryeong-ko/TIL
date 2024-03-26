import java.util.*;

class Solution {
    class Num {
        int n;
        int cnt;
        
        public Num(int n, int cnt) {
            this.n = n;
            this.cnt = cnt;
        }
    }
    
    public int solution(int x, int y, int n) {
        if(x == y) {
            return 0;
        }
        
        if(x > y) {
            return -1;
        }
        
        return bfs(x, y, n);
    }
    
    public int bfs(int x, int y, int n) {
        Queue<Num> q = new LinkedList<>();
        boolean[] used = new boolean[4000000];
        q.add(new Num(x, 0));
        used[x] = true;
        
        while(!q.isEmpty()) {
            Num num = q.poll();
            int[] nums = {num.n + n, num.n * 2, num.n * 3}; 
            
            for(int i = 0; i < 3; i++) {
                if(nums[i] == y) {
                    return num.cnt + 1;
                }
                
                if(nums[i] < y && !used[nums[i]]) {
                    q.add(new Num(nums[i], num.cnt + 1));
                    used[nums[i]] = true;
                }
            }
        }
        
        return -1;
    }
}
