class Solution {
    private int[] ans;
    
    public int[] solution(int[][] arr) {
        ans = new int[2];
        
        divide(arr, 0, 0, arr.length);
        
        return ans;
    }
    
    public void divide(int[][] arr, int r, int c, int len){
        boolean same = true;
        for(int i = 0; same && i < len; i++){
            for(int j = 0; j < len; j++){
                if(arr[r][c] != arr[r + i][c + j]){
                    same = false;
                    break;
                }
            }
        }
        
        if(same){
            ans[arr[r][c]]++;
            return;
        }
        
        len /= 2;
        divide(arr, r, c, len); // 2사분면
        divide(arr, r, c + len, len); // 1사분면
        divide(arr, r + len, c, len); // 3사분면
        divide(arr, r + len, c + len, len); // 4사분면
    }
    
}
