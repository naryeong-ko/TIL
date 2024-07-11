import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int n = 2;

        for(int i = 1; i <= N; i++) {
            n += n - 1;
        }

        System.out.print(n * n);
    }
}
