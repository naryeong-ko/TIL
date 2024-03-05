import java.util.*;

class Solution {
    public int solution(String begin, String target, String[] words) {
        int targetIdx = getTargetIdx(target, words);
        if(targetIdx == -1) {
            return 0;
        }
        
        return bfs(begin, targetIdx, words);
    }
    
    public int getTargetIdx(String target, String[] words) { // target 인덱스 찾기
        int idx = words.length;
        
        while(--idx >= 0){
            if(target.equals(words[idx])){
                return idx;
            }
        }
        
        return -1;
    }
    
    public int bfs(String begin, int targetIdx, String[] words) {
        int wlen = words.length;
        Queue<Integer> q = new LinkedList<>(); // 변환할 수 있는 단어 인덱스 큐
        int[] d = new int[wlen]; // 단어 인덱스 별 변환 횟수
        
        for(int i = 0; i < wlen; i++) { // 제일 처음 변환할 수 있는 단어들의 인덱스 큐에 넣기
            if(diff1(begin, words[i])) {
                d[i]++;
                if(targetIdx == i) { // target으로 변환 성공
                    return 1;
                }
                q.add(i);
            }
        }
        
        while(!q.isEmpty()) {
            int nowIdx = q.poll();
            
            for(int i = 0; i < wlen; i++) {
                if(d[i] == 0 && diff1(words[nowIdx], words[i])) { // 변환할 수 있는 경우
                    d[i] = d[nowIdx] + 1;
                    
                    if(targetIdx == i) { // target으로 변환 성공
                        return d[i];
                    }
                    
                    q.add(i);
                }
            }
        }
        
        return 0;
    }
    
    public boolean diff1(String a, String b) { // 두 단어의 차이가 한 개의 알파벳인지
        int idx = a.length();
        int diff = 0;
        
        while(--idx >= 0) {
            if(a.charAt(idx) != b.charAt(idx)) {
                diff++;
            }    
        }
        
        return diff == 1;
    }
}
