import java.io.*;

public class Main {

    private static int cnt;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        cnt = 0;

        fib(n);
        bw.write(cnt + " ");
        fibonacci(n);
        bw.write(cnt + "");

        bw.flush();
        br.close();
        bw.close();
    }

    public static int fib(int n) {
        if(n == 1 || n == 2) {
            cnt++;
            return 1;
        }

        else return (fib(n - 1) + fib(n - 2));
    }

    public static int fibonacci(int n) {
        cnt = 0;
        int[] nums = new int[n + 1];

        nums[1] = 1;
        nums[2] = 1;
        for(int i = 3; i <= n; i++) {
            cnt++;
            nums[i] = nums[i - 1] + nums[i - 2];
        }

        return nums[n];
    }

}
