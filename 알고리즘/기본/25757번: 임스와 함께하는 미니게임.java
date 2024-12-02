import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<String> set = new HashSet<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        String g = st.nextToken();
        int num = 1;

        if(g.equals("F")) {
            num = 2;
        } else if(g.equals("O")) {
            num = 3;
        }

        for(int i = 0; i < n; i++) {
            set.add(br.readLine());
        }

        System.out.print(set.size() / num);
    }

}
