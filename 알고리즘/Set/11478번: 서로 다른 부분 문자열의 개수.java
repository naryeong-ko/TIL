import java.io.*;
import java.util.*;

public class Main {
    private static Set<String> set;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        set = new HashSet<>();

        for(int i = 1; i <= S.length(); i++) {
            getAns(i, S);
        }

        System.out.print(set.size());
        br.close();
    }

    public static void getAns(int len, String S) {
        for(int i = 0; i + len <= S.length(); i++) {
            set.add(S.substring(i, i + len));
        }
    }
}
