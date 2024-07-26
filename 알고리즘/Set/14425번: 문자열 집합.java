import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        Set<String> set = new HashSet<>();

        while(N-- > 0) {
            set.add(br.readLine());
        }

        int ans = 0;
        while(M-- > 0) {
            if(set.contains(br.readLine())) {
                ans++;
            }
        }

        System.out.print(ans);
        br.close();
    }

}
