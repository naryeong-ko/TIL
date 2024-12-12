import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());
        int[] nums = new int[N + 1];

        st = new StringTokenizer(br.readLine());
        for(int i = 1; i <= N; i++) {
            nums[i] = nums[i - 1] + Integer.parseInt(st.nextToken());
        }

        int ans = 0;
        int cnt = 1;
        for(int i = X; i <= N; i++) {
            int sum = nums[i] - nums[i - X];

            if(sum == ans) {
                cnt++;
            } else if(sum > ans) {
                ans = sum;
                cnt = 1;
            }
        }

        if(ans == 0) {
            System.out.print("SAD");
        } else {
            System.out.print(ans + "\n" + cnt);
        }

        br.close();
    }

}
