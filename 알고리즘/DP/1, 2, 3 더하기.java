import java.util.*;
import java.io.*;
public class Main {
   
   public static void main(String[] args)throws IOException   {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringBuilder ans = new StringBuilder();
      int T = Integer.parseInt(br.readLine());
      int dp[] = new int [11];
      
      dp[1] = 1;
      dp[2] = 2;
      dp[3] = 4;
      for(int i = 4; i <= 10; i++) {
         dp[i] = dp[i - 3] + dp[i - 2] + dp[i - 1];
      }
      
      for(int tc = 0; tc < T; tc++) {
            int n = Integer.parseInt(br.readLine());
         ans.append(dp[n]).append("\n");
      }
        
       System.out.print(ans);
   }
   
}
