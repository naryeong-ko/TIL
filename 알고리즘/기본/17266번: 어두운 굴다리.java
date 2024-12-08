import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int ans = Integer.parseInt(st.nextToken());
        int pos = ans;
        for(int i = 1; i < M; i++) {
            int now = Integer.parseInt(st.nextToken());
            ans = Math.max(ans, (int)Math.ceil((double)(now - pos) / 2));
            pos = now;
        }

        System.out.print(Math.max(ans, N - pos));
        br.close();
    }

}
