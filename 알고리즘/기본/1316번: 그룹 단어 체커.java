import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int ans = 0;

        for(int i = 0; i < T; i++) {
            String str = br.readLine();
            boolean success = true;
            boolean[] nums = new boolean[26];
            char pre = str.charAt(0);
            nums[str.charAt(0) - 'a'] = true;

            for(int j = 1; j < str.length(); j++) {
                if(nums[str.charAt(j) - 'a']) {
                    if(pre != str.charAt(j)) {
                        success = false;
                        break;
                    }
                } else {
                    nums[str.charAt(j) - 'a'] = true;
                    pre = str.charAt(j);
                }
            }

            if(success) {
                ans++;
            }
        }

        System.out.print(ans);
    }

}
