import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] dis = new int[N];
        int[] money = new int[N];
        long ans = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 1; i < N; i++) {
            dis[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            money[i] = Integer.parseInt(st.nextToken());
        }

        int idx;
        for(int i = 0; i < N; i += idx) {
            idx = 1;
            long sumD = 0;
            while(i + idx < N) {
                sumD += dis[i + idx];

                if(money[i] > money[i + idx]) {
                    break;
                }
                idx++;
            }

            ans += money[i] * sumD;
        }

        System.out.print(ans);
        br.close();
    }

}
