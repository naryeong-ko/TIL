import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] Ws = new int[N + 1];
        boolean[] best = new boolean[N + 1];
        boolean[] friend = new boolean[N + 1];
        boolean[] alreadyFail = new boolean[N + 1];
        
        st = new StringTokenizer(br.readLine());
        for(int i = 1; i <= N; i++){
            Ws[i] = Integer.parseInt(st.nextToken());
        }
        
        for(int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            friend[a] = true;
            friend[b] = true;

            if(Ws[a] > Ws[b]){
                best[a] = true;
                alreadyFail[b] = true;
            }else if(Ws[a] < Ws[b]){
                best[b] = true;
                alreadyFail[a] = true;
            }else{
                alreadyFail[a] = true;
                alreadyFail[b] = true;
            }
        }
        
        int ans = 0;
        for(int i = 1; i <= N; i++){
            if(!alreadyFail[i] && best[i] || !friend[i]){
                ans++;
            }
        }

        System.out.print(ans);
    }
}
