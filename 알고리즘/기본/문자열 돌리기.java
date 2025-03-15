import java.util.Scanner;
import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for(char c : a.toCharArray()) {
            bw.write(c + "\n");
        }

        bw.flush();
        bw.close();
    }
}
