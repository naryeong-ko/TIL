import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] nums = new int[n + 1];

        if(n != 0) {
            nums[1] = 1;
            for(int i = 2; i <= n; i++) {
                nums[i] = nums[i - 1] + nums[i - 2];
            }
        }

        System.out.print(nums[n]);
        br.close();
    }

}
