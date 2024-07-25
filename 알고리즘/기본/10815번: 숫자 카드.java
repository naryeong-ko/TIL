import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        boolean[] nums = new boolean[20000001]; // -10,000,000 ~ 10,000,000 -> 0 ~ 20,000,000 사용

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        while(N-- > 0) {
            nums[Integer.parseInt(st.nextToken()) + 10000000] = true;
        }

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        while(M-- > 0) {
            if(nums[Integer.parseInt(st.nextToken()) + 10000000]) {
                bw.write("1 ");
            }else {
                bw.write("0 ");
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }

}
