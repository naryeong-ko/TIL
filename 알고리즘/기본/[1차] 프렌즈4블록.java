class Solution {
    boolean[][] noValueMap; // true : 지워짐. 값 없음.
    int answer;
    char[][] realMap;
    
    public int solution(int m, int n, String[] board) {
        init(m, n, board);
        playGame(m, n);
        return answer;
    }
    
    public void init(int m, int n, String[] board) {
        answer = 0;
        noValueMap = new boolean[m][n];
        realMap = new char[m][n];
        
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                realMap[i][j] = board[i].charAt(j);
            }
        }
    }
    
    public void playGame(int m, int n) {
        while(true){
            boolean doRemove = false;
            boolean[][] changeMap = new boolean[m][n]; // true : 지워져야 함
            
            for(int i = 0; i < m - 1; i++) {
                for(int j = 0; j < n - 1; j++) {
                    if(!noValueMap[i][j]) {
                        if(checkSquare(i, j, changeMap)) {
                            doRemove = true;
                        }
                    }
                }
            }
            
            if(!doRemove) { // 지울 게 없다면 게임 종료
                break;
            }
            
            removeSquare(m, n, changeMap);
        }
    }
    
    public boolean checkSquare(int r, int c, boolean[][] changeMap) { // 지울 게 있으면 changeMap에 표시하고 true 리턴
        char now = realMap[r][c];

        for(int i = r; i < r + 2; i++) {
            for(int j = c; j < c + 2; j++) {
                if(noValueMap[i][j] || now != realMap[i][j]) {
                    return false;
                }
            }
        }
        
        for(int i = r; i < r + 2; i++) {
            for(int j = c; j < c + 2; j++) {
                changeMap[i][j] = true;
            }
        }
        
        return true;
    }
    
    public void removeSquare(int m, int n, boolean[][] changeMap) {
        for(int j = 0; j < n; j++) {
            for(int i = 0; i < m; i++) {
                int r = 0;
                if(changeMap[i][j]) {
                    r = i;
                    noValueMap[i][j] = true;
                    
                    while(++i < m && changeMap[i][j]) {
                        noValueMap[i][j] = true;
                    }
                    
                    int plus = i - r; // 내려올 길이
                    answer += plus;
                    while(--r >= 0 && !noValueMap[r][j]){
                        realMap[r + plus][j] = realMap[r][j];
                        
                        noValueMap[r][j] = true;
                        noValueMap[r + plus][j] = false;
                    }
                }
            }
        }
    }
}
