import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] nums = new int[N][M];

        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < M; j++) {
                nums[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int[][][] memo = new int[N][M][3];

        for(int i = 0; i < M; i++) {
            for(int j = 0; j < 3; j++) {
                memo[0][i][j] = nums[0][i];
            }
        }

        for(int i = 1; i < N; i++) {
            for(int j = 0; j < M; j++) {
                if(j == 0) {
                    memo[i][j][0] = nums[i][j] + Math.min(memo[i - 1][j + 1][1], memo[i - 1][j + 1][2]);
                    memo[i][j][1] = nums[i][j] + memo[i - 1][j][0];
                } else if(j == M - 1) {
                    memo[i][j][1] = nums[i][j] + memo[i - 1][j][2];
                    memo[i][j][2] = nums[i][j] + Math.min(memo[i - 1][j - 1][0], memo[i - 1][j - 1][1]);
                } else {
                    memo[i][j][0] = nums[i][j] + Math.min(memo[i - 1][j + 1][1], memo[i - 1][j + 1][2]);
                    memo[i][j][1] = nums[i][j] + Math.min(memo[i - 1][j][0], memo[i - 1][j][2]);
                    memo[i][j][2] = nums[i][j] + Math.min(memo[i - 1][j - 1][0], memo[i - 1][j - 1][1]);
                }
            }
        }

        int ans = Math.min(memo[N - 1][0][0], memo[N - 1][0][1]);
        for(int i = 1; i < M - 1; i++) {
            for(int j = 0; j < 3; j++) {
                ans = Math.min(ans, memo[N - 1][i][j]);
            }
        }
        ans = Math.min(ans, Math.min(memo[N - 1][M - 1][1], memo[N - 1][M - 1][2]));

        System.out.print(ans);
        br.close();
    }

}
