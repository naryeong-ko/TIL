import java.util.*;

class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int rlen1 = arr1.length;
        int clen1 = arr1[0].length;
        int clen2 = arr2[0].length;
        
        int[][] answer = new int[rlen1][clen2];
        
        for(int i = 0; i < rlen1; i++){
            for(int j = 0; j < clen2; j++){
                for(int k = 0; k < clen1; k++){
                    answer[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }
        
        return answer;
    }
}
