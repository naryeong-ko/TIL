import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] n = new int[3][2]; // 분자, 분모

        for(int i = 0; i < 2; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            n[i][0] = Integer.parseInt(st.nextToken());
            n[i][1] = Integer.parseInt(st.nextToken());
        }

        n[2][0] = n[0][0] * n[1][1] + n[1][0] * n[0][1];
        n[2][1] = n[0][1] * n[1][1];

        int ngcd = gcd(n[2][0], n[2][1]);

        System.out.print(n[2][0] / ngcd + " " + n[2][1] / ngcd);
        br.close();
    }

    public static int gcd(int a, int b) {
        if(b == 0) {
            return a;
        }

        return gcd(b, a % b);
    }
}
