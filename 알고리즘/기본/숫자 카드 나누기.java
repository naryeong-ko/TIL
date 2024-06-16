import java.util.*;

class Solution {
    public boolean divide(int[] arr, int num){
        for(int n : arr){
            if(n % num == 0) {
                continue;
            }else {
                return false;
            }
        }
        
        return true;
    }

    public boolean xdivide(int[] arr, int num){
        for(int n : arr){
            if(n % num != 0) {
                continue;
            }else {
                return false;
            }
        }

        return true;
    }

    public int solution(int[] arrayA, int[] arrayB) {
        int answer = 0;
        int num = Math.max(arrayA[0], arrayB[0]);
        
        for(int i = num; i >= 2; i--) {
            if((divide(arrayA, i) && xdivide(arrayB, i)) || (divide(arrayB, i) && xdivide(arrayA, i))) {
                answer = i;
                break;
            }
        }
        
        return answer;
    }
}
