import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int cnt = 1;

        for(int i = 0; i < N; i++) {
            int n = Integer.parseInt(st.nextToken());
            if(cnt == n) {
                cnt++;
            } else {
                stack.push(n);
            }

            while(!stack.isEmpty() && stack.peek() == cnt) {
                stack.pop();
                cnt++;
            }
        }

        if(stack.size() == 0) {
            System.out.print("Nice");
        } else {
            System.out.print("Sad");
        }

        br.close();
    }

}
