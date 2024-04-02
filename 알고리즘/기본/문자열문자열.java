import java.io.*;

public class Solution {

    public static void main(String[] args)throws IOException {
        StringBuilder ans = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for(int tc = 1; tc <= T; tc++) {
            int N = Integer.parseInt(br.readLine());
            String str = br.readLine();
            String a = "No";

            if(N % 2 == 0 && str.substring(0, N / 2).equals(str.substring(N / 2))) {
                a = "Yes";
            }

            ans.append("#" + tc + " " + a + "\n");
        }

        System.out.print(ans.toString());
    }
}
