import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        while(num > 0) {
            int now = num % b;
            num /= b;

            if(now > 9) {
                sb.append((char)(now - 10 + 'A'));
            } else {
                sb.append(now);
            }
        }

        System.out.print(sb.reverse().toString());
    }

}
