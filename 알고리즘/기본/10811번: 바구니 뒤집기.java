import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] nums = new int[N + 1]; // 바구니 1~N 사용
        for(int i = 1; i <= N; i++) {
            nums[i] = i;
        }

        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            while(a < b) {
                int tmp = nums[a];
                nums[a++] = nums[b];
                nums[b--] = tmp;
            }
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i = 1; i <= N; i++) {
            bw.write(nums[i] + " ");
        }

        bw.flush();
        br.close();
        bw.close();
    }

}
