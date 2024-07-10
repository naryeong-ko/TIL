import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());

        for(int tc = 0; tc < T; tc++) {
            int num = Integer.parseInt(br.readLine());
            bw.write(num / 25 + " ");
            num %= 25;

            bw.write(num / 10 + " ");
            num %= 10;

            bw.write(num / 5 + " ");
            bw.write(num % 5 + "\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }

}
