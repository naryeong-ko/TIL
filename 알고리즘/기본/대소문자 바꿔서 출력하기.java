import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        char[] str = br.readLine().toCharArray();

        for(char c : str) {
            if(c < 97) {
                bw.write((char)(c + 32));
            } else {
                bw.write((char)(c - 32));
            }
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
