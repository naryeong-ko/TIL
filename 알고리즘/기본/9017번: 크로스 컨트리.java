import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());

        for(int tc = 0; tc < T; tc++) {
            int[][] ans = new int[201][3];
            
            int[] max = {-1, 201, 201};
            int N = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());

            for(int i = 1; i <= N; i++) {
                int n = Integer.parseInt(st.nextToken());
                ans[n][0]++;
                if(ans[n][0] <= 4) {
                    ans[n][1] += i;
                } else if(ans[n][0] == 5) {
                    ans[n][2] = i;
                }
            }

            for(int i = 1; i <= 200; i++) {
                if(ans[i][0] == 6 && (max[1] > ans[i][1] || (max[1] == ans[i][1] && max[2] > ans[i][2]))) {
                    max[0] = i;
                    max[1] = ans[i][1];
                    max[2] = ans[i][2];
                }
            }

            bw.write(max[0] + "\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }

}
