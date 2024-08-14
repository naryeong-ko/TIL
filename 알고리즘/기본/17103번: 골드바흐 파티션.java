import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        int[] visit = new int[1000001]; // 0:확인 안 함, -1:소수 아님, 1:소수

        while(T-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int cnt = 0;

            if(n < 7) {
                bw.write("1\n");
            } else {
                for(int i = 3; i <= n / 2; i += 2) {
                    if(visited[i] == -1 || visited[n - i] == -1) {
                        continue;
                    }

                    if(visited[i] == 0) {
                        if(!check(i)) {
                            visited[i] = -1;
                            continue;
                        }

                        visited[i] = 1;
                    }

                    if(visited[n - i] == 0) {
                        if(!check(n - i)) {
                            visited[n - i] = -1;
                            continue;
                        }

                        visited[n - i] = 1;
                    }

                    cnt++;
                }
                bw.write(cnt + "\n");
            }
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
