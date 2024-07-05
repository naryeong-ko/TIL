import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double ans = 0;
        int cnt = 0;

        for(int i = 0; i < 20; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            int num = st.nextToken().charAt(0) - '0';
            str = st.nextToken();
            if(str.charAt(0) != 'P') {
                cnt += num;
                double plus = 1; // D0로 초기화
                if (str.charAt(0) != 'F') {
                    if (str.charAt(0) == 'A') {
                        plus = 4;
                    } else if (str.charAt(0) == 'B') {
                        plus = 3;
                    } else if (str.charAt(0) == 'C') {
                        plus = 2;
                    }

                    if (str.charAt(1) == '+') {
                        plus += 0.5;
                    }

                    ans += plus * num;
                }
            }
        }

        System.out.print(ans / cnt);
    }

}
