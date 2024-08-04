import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] nums = new int[N];
        int ans = 0;

        for(int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(br.readLine());
        }

        int g = nums[1] - nums[0];
        for(int i = 2; i < N; i++) {
            g = gcd(g, nums[i] - nums[i - 1]);
        }

        for(int i = 1; i < N; i++) {
            ans += (nums[i] - nums[i - 1]) / g;
        }
        ans -= N - 1;

        System.out.print(ans);
        br.close();
    }

    public static int gcd(int a, int b) {
        if(b == 0) {
            return a;
        }

        return gcd(b, a % b);
    }
}
