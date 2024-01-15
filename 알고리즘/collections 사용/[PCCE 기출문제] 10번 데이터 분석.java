import java.util.*;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        List<int[]> arrs = new ArrayList<>();
        int dlen = data.length;
        String[] sorts = {"code", "date", "maximum", "remain"};
        int sortIdx = 0;
        int extIdx = 0;
        
        for(int i = 0; i < 4; i++){
            if(sorts[i].equals(sort_by)){
                sortIdx = i;
            }
            if(sorts[i].equals(ext)){
                extIdx = i;
            }
        }
        
        for(int i = 0; i < dlen; i++){
            if(data[i][extIdx] < val_ext){
                arrs.add(data[i]);
            }
        }
        
        final int sidx = sortIdx;
        
        Collections.sort(arrs, (o1, o2) -> o1[sidx] - o2[sidx]);
        
        int alen = arrs.size();
        int[][] answer = new int[alen][4];
        for(int i = 0; i < alen; i++){
            answer[i] = arrs.get(i);
        }
        
        return answer;
    }
}
