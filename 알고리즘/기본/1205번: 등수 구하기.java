import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int ans = 1;

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int score = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        if(N > 0) {
            st = new StringTokenizer(br.readLine());
            int cnt = 0;
            for(int i = 0; i < N; i++) {
                int n = Integer.parseInt(st.nextToken());
                if(n > score) {
                    ans++;
                } else if(n == score) {
                    cnt++;
                }
            }

            if(ans + cnt > P) {
                ans = -1;
            }
        }

        System.out.print(ans);
    }

}
