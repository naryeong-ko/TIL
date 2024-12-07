import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());

        for(int tc = 0; tc < T; tc++) {
            int[] cnt = new int[201];
            int[][] sum = new int[201][3];// 개수, 합, 5번 원소
            List<Integer> list = new ArrayList<>();
            int N = Integer.parseInt(br.readLine());
            int[] nums = new int[N + 1];
            StringTokenizer st = new StringTokenizer(br.readLine());

            for(int i = 1; i <= N; i++) {
                nums[i] = Integer.parseInt(st.nextToken());
                cnt[nums[i]]++;
            }

            int idx = 1;
            for(int i = 1; i <= N; i++) {
                if(cnt[nums[i]] == 6) {
                    if(++sum[nums[i]][0] < 5) {
                        sum[nums[i]][1] += idx;
                    } else if(sum[nums[i]][0] == 5) {
                        sum[nums[i]][2] = idx;
                    }

                    idx++;
                }
            }

            int[] max = {0, 1000, 201}; // 1등인 팀 번호, 합, 5번 원소
            for(int i = 1; i <= 200; i++) {
                if(sum[i][0] == 6 && (sum[i][1] < max[1] || (sum[i][1] == max[1] && sum[i][2] < max[2]))) {
                    max[0] = i;
                    max[1] = sum[i][1];
                    max[2] = sum[i][2];
                }
            }

            bw.write(max[0] + "\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }

}
