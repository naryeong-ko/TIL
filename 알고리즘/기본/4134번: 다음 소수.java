import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        while(T-- > 0) {
            long n = Long.parseLong(br.readLine());
            if(n <= 1) {
                n = 3;
            }else {
                while(!check(n++)) {
                }
            }

            bw.write(n - 1 + "\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }

    public static boolean check(long a) {
        for(long i = 2; i * i <= a; i++) {
            if(a % i == 0) {
                return false;
            }
        }

        return true;
    }
}
