import java.io.*;
import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder ans = new StringBuilder();
        int N = sc.nextInt(); // 학생 수
        int K = sc.nextInt(); // 구간 수
        int[] sums = new int[N + 1];
        
        for(int i = 1; i <= N; i++){
            sums[i] = sums[i - 1] + sc.nextInt();
        }

        for(int i = 0; i < K; i++){
            int a = sc.nextInt() - 1;
            int b = sc.nextInt();
            double cal = (double)(sums[b] - sums[a]) / (b - a);
            ans.append(String.format("%.2f", cal) + "\n");
        }

        System.out.print(ans);
    }
}
