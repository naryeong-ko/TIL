import java.util.*;

class Solution {

    private char[] alphas = {'A', 'E', 'I', 'O', 'U'};
    private List<String> words; 
    
    public int solution(String word) {
        init();
        dfs("");
        return words.indexOf(word) + 1; // 인덱스는 0부터 시작하므로 +1
    }
    
    public void init(){
        words = new LinkedList<>();
    }
    
    public void dfs(String nowWord){
        if(nowWord.length() == 5){
            return;
        }
        
        for(int i = 0; i < 5; i++){
            String nextWord = nowWord + alphas[i];
            words.add(nextWord);
            dfs(nextWord);
        }
    }
}
