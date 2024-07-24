import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] nums = new int[3];
        for(int i = 0; i < 3; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        int maxIdx = 0;
        for(int i = 1; i < 3; i++) {
            if(nums[maxIdx] < nums[i]) {
                maxIdx = i;
            }
        }

        int sum = 0;
        for(int i = 0; i < 3; i++) {
            if(maxIdx != i) {
                sum += nums[i];
            }
        }

        if(sum > nums[maxIdx]) {
            System.out.print(sum + nums[maxIdx]);
        } else {
            System.out.print(sum * 2 - 1);
        }
    }

}
