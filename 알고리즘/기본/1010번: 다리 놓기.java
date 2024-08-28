import java.io.*;
import java.util.*;

public class Main {

    static int[][] visit = new int[30][30];

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if (a == 0 || b == 0) {
                bw.write("0\n");
            } else {
                bw.write(comb(b, a) + "\n");
            }
        }

        bw.flush();
        br.close();
        bw.close();
    }

    static int comb(int a, int b){
        if (a == b || b == 0) {
            return 1;
        }

        if (visit[a][b] != 0) {
            return visit[a][b];
        }

        return visit[a][b] = comb(a - 1, b - 1) + comb(a - 1, b);
    }
}
