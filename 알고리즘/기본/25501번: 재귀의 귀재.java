import java.io.*;

public class Main {
    private static int cnt;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        while(T-- > 0) {
            cnt = 0;
            bw.write(isPalindrome(br.readLine()) + " " + cnt + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static int recursion(String s, int l, int r) {
        cnt++;

        if(l >= r) {
            return 1;
        }

        if(s.charAt(l) != s.charAt(r)) {
            return 0;
        }

        return recursion(s, l + 1, r - 1);
    }

    public static int isPalindrome(String s) {
        return recursion(s, 0, s.length() - 1);
    }

}
