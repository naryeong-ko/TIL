import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] nums = new int[3];
        int sum = 0;

        for(int i = 0; i < 3; i++) {
            nums[i] = Integer.parseInt(br.readLine());
            sum += nums[i];
        }

        String ans = "Error";
        if(sum == 180) {
            if(nums[0] == nums[1] || nums[0] == nums[2] || nums[1] == nums[2]) {
                ans = "Isosceles";
                if(nums[0] == 60) {
                    ans = "Equilateral";
                }
            }else {
                ans = "Scalene";
            }
        }

        System.out.print(ans);
    }

}
