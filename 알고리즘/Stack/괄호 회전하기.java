import java.util.*;

class Solution {
    private char[] basic = {'(', '[', '{', ')', ']', '}'};
    
    public int solution(String s) {
        int answer = 0;
        int slen = s.length();
        char[] ss = new char[slen * 2]; // 매번 스트링을 만들지 않기 위해 문자열이 두 번 반복되는 배열로 만들기
        for(int i = 0; i < slen; i++){
            ss[i] = s.charAt(i);
            ss[i + slen] = ss[i];
        }
        
        for(int i = 0; i < slen; i++){
            if(checkS(ss, i, i + slen)){
                answer++;
            }
        }
        
        return answer;
    }
    
    public boolean checkS(char[] s, int start, int end){
        Stack<Character> stack = new Stack<>(); 
        
        for(int i = start; i < end; i++){
            for(int b = 0; b < 6; b++){
                if(s[i] == basic[b]){
                    if(b < 3){ // 열린 괄호라면 스택에 넣기
                        stack.push(basic[b]);
                    }else if(stack.isEmpty()){ // 닫힌 괄호인데 스택에 남은 열린 괄호가 없다면 실패
                        return false;
                    }else if(stack.pop() != basic[b - 3]){ // 닫힌 괄호지만 스택에서 뽑은 열린 괄호와 같은 형태가 아니라면 실패
                        return false;
                    }
                    
                    break;
                }
            }
        }
        
        if(!stack.isEmpty()){ // 열린 괄호가 남아있다면 실패
            return false;
        }
        
        return true;
    }
}
