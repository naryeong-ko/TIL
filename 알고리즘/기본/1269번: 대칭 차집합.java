import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int ans = a + b;
        boolean[] an = new boolean[100000000];

        st = new StringTokenizer(br.readLine());
        while(a-- > 0) {
            an[Integer.parseInt(st.nextToken())] = true;
        }

        st = new StringTokenizer(br.readLine());
        while(b-- > 0) {
            if(an[Integer.parseInt(st.nextToken())]) {
                ans -= 2;
            }
        }

        System.out.print(ans);
    }

}
