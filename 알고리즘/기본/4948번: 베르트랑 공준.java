import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] visit = new int[123456 * 2 + 1]; // 0:확인 안 함, -1:소수 아님, 1:소수

        while(true) {
            int n = Integer.parseInt(br.readLine());
            if(n == 0) {
                break;
            }

            int cnt = 0;
            for(int i = n + 1; i <= n * 2; i++) {
                if(visit[i] == -1) {
                    continue;
                }

                if(visit[i] == 0) {
                    if(!check(i)) {
                        visit[i] = -1;
                        continue;
                    }

                    visit[i] = 1;
                }

                cnt++;
            }

            bw.write(cnt + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static boolean check(int n) {
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
