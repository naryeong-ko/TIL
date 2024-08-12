import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = br.readLine();
        int N = Integer.parseInt(input);
        int[] nums = new int[input.length()];

        for(int i = 0; N > 0; i++) {
            nums[i] = N % 10;
            N /= 10;
        }

        Arrays.sort(nums);

        for(int i = input.length() - 1; i >= 0; i--) {
            bw.write(nums[i] + "");
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
