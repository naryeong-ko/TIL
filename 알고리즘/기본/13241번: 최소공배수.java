import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());

        System.out.print(A * B / gcd(A, B));
        br.close();
    }

    public static long gcd(long a, long b) {
        if(b == 0) {
            return a;
        }

        return gcd(b, a % b);
    }
}
