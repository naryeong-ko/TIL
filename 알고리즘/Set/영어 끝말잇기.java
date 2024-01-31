import java.util.*;

class Solution {
    
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        
        if(words[0].length() < 2){
            answer = result(1, 1);
            return answer;
        }
        
        int wlen = words.length;
        Set<String> set = new HashSet<>();
        set.add(words[0]);
        
        for(int i = 1; i < wlen; i++){
            int nlen = words[i].length();
            if(nlen < 2 || words[i - 1].charAt(words[i - 1].length() - 1) != words[i].charAt(0)){ // 단어 길이 2 이상, 이전 단어의 마지막 문자로 시작하는 단어인지 조건 확인 
                answer = result(i, n);
                break;
            }
            
            set.add(words[i]);
            if(set.size() == i){ // set 사이즈가 증가하지 않은 경우 이미 나온 단어
                answer = result(i, n);
                break;
            }
        }
        
        return answer;
    }
    
    public int[] result(int i, int n){
        return new int [] {(i % n + 1), (i / n + 1)};
    }
    
}
