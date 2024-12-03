import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int P = Integer.parseInt(br.readLine());

        for(int p = 1; p <= P; p++) {
            int ans = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            bw.write(st.nextToken() + " ");

            int[] hs = new int[20];
            for(int i = 0; i < 20; i++) {
                hs[i] = Integer.parseInt(st.nextToken());
            }

            for(int i = 0; i < 20; i++) {
                for(int j = i + 1; j < 20; j++) {
                    if(hs[i] > hs[j]) {
                        ans++;
                    }
                }
            }

            bw.write(ans + "\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }

}
