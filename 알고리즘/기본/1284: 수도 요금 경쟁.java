import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Solution {
    public static void main(String args[]) throws Exception {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for(int tc = 1; tc <= T; tc++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int P = Integer.parseInt(st.nextToken());
            int Q = Integer.parseInt(st.nextToken());
            int R = Integer.parseInt(st.nextToken());
            int S = Integer.parseInt(st.nextToken());
            int W = Integer.parseInt(st.nextToken());

            int A = W * P;
            int B = Q;
            if(W > R) {
                B += (W - R) * S;
            }

            int ans = Math.min(A, B);
            sb.append("#").append(tc).append(" ").append(ans).append("\n");
        }

        System.out.print(sb.toString());
    }
}
