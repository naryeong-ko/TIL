import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String str = st.nextToken();
        int num = Integer.parseInt(st.nextToken());
        int ans = 0;
        int cnt = 1;

        for(int i = str.length() - 1; i >= 0; i--) {
            int now = str.charAt(i) - '0';
            if(now > 9) {
                now = str.charAt(i) - 'A' + 10;
            }

            ans += cnt * now;
            cnt *= num;
        }

        System.out.print(ans);
    }

}
