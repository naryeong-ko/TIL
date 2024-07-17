import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        if(N != 1) {
            StringBuilder sb = new StringBuilder();
            int cnt = 2;

            while(cnt <= N) {
                if(N % cnt == 0) {
                    N /= cnt;
                    sb.append(cnt + "\n");
                } else {
                    cnt++;
                }
            }

            System.out.print(sb.toString());
        }

        br.close();
    }

}
