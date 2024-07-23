import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while(true) {
            int[] nums = new int[3];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int i = 0; i < 3; i++) {
                nums[i] = Integer.parseInt(st.nextToken());
            }

            if(nums[0] == 0) {
                break;
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

            String ans = "Invalid";
            if(sum > nums[maxIdx]) {
                if(nums[0] == nums[1]) {
                    ans = "Isosceles";
                    if(nums[1] == nums[2]) {
                        ans = "Equilateral";
                    }
                }
                else if (nums[0] == nums[2] || nums[1] == nums[2]) {
                    ans = "Isosceles";
                } else {
                    ans = "Scalene";
                }
            }

            sb.append(ans + "\n");
        }

        System.out.print(sb.toString());
    }

}
