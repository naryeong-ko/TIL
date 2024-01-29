import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String[] ans = {"ascending", "descending", "mixed"};
        int state = 0;
        if(Integer.parseInt(st.nextToken()) == 8){
            state = 1;
        }
        
        for(int i = 2; i <= 8; i++){
            int now = Integer.parseInt(st.nextToken());
            if(state == 0 && now != i){
                state = 2;
            }else if(state == 1 && now != 9 - i){
                state = 2;
            }
        }
        
        System.out.print(ans[state]);
    }
}
